package jdo.application;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import jdo.party.model.Company;
import jdo.party.model.PartyRole;
import jdo.party.model.roles.InternalOrganization;
import jdo.party.model.roles.ParentOrganization;

/**
 * Single place to get all configuration information, without having to worry
 * about where it comes from.
 *
 * @author Jim
 *
 */
@Stateful
public class ApplicationConfiguration {

	/**
	 * Entity manager for jpa2 access.
	 */
	@PersistenceContext(name = "PeopleAndOrganizations", type = PersistenceContextType.EXTENDED)
	private EntityManager entityManager;

	/**
	 * Represents the company whose customer we're managing.
	 *
	 * @return The actual company, or a default company.
	 */
	public Company company() {
		return findCompany().orElseGet(defaultCompany);
	}

	/**
	 * The default company, if none is provided.
	 */
	private final Supplier<Company> defaultCompany = () -> {
		final Company company = new Company();
		company.setName("The company in question");
		company.addPartyRole(new InternalOrganization());
		company.addPartyRole(new ParentOrganization());
		entityManager.persist(company);
		return company;
	};

	/**
	 * Find the company that we're managing customers for.
	 *
	 * @return The company, or empty if we can't find it.
	 */
	public Optional<Company> findCompany() {
		final CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		final CriteriaQuery<Company> criteria = builder.createQuery(Company.class);
		final Root<Company> entityRoot = criteria.from(Company.class);
		criteria.select(entityRoot);

		final TypedQuery<Company> query = entityManager.createQuery(criteria);
		final List<Company> list = query.getResultList();
		// I couldn't figure out the freaking JPA criteria.. this was easier :)
		// TODO Figure out how to do this in a criteria

		final List<Company> filteredList = list.stream().filter(c -> {
			final boolean hasParentOrganization = c.getActingAs().stream().anyMatch(parentOrganizationPredicate());
			final boolean hasInternalOrganization = c.getActingAs().stream().anyMatch(internalOrganizationPredicate());
			return hasParentOrganization && hasInternalOrganization;
		}).collect(Collectors.toList());
		return filteredList.isEmpty() ? Optional.empty() : Optional.ofNullable(filteredList.get(0));

	}

	/**
	 * Convenience method for an anonymous function to filter for the
	 * internalOrganization role.
	 *
	 * @return an anonymous function that filters for the internal organization
	 *         role.
	 */
	public static final Predicate<PartyRole> internalOrganizationPredicate() {
		final Predicate<PartyRole> isInternalOrganization = a -> (a instanceof InternalOrganization)
				& a.getDateTimeRange().isActive();
		return isInternalOrganization;
	}

	/**
	 * Convenience method for an anonymous function to filter for the parent
	 * organization role.
	 *
	 * @return and anonymous function that filters for parent organization role.
	 */
	public static final Predicate<PartyRole> parentOrganizationPredicate() {
		final Predicate<PartyRole> isParent = a -> (a instanceof ParentOrganization);
		return isParent;
	}
}
