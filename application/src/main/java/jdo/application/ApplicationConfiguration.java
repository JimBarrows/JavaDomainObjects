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

@Stateful
public class ApplicationConfiguration {

	@PersistenceContext(name = "PeopleAndOrganizations", type=PersistenceContextType.EXTENDED)
	private EntityManager entityManager;

	public Company company() {
		return findCompany().orElseGet(defaultCompany);
	}

	private Supplier<Company> defaultCompany=new Supplier<Company>(){

	@Override public Company get(){Company company=new Company();company.setName("The company in question");company.addPartyRole(new InternalOrganization());company.addPartyRole(new ParentOrganization());entityManager.persist(company);return company;}};

	public Optional<Company> findCompany() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Company> criteria = builder.createQuery(Company.class);
		Root<Company> entityRoot = criteria.from(Company.class);
		criteria.select(entityRoot);

		TypedQuery<Company> query = entityManager.createQuery(criteria);
		List<Company> list = query.getResultList();
		// I couldn't figure out the freaking JPA criteria.. this was easier :)
		// TODO Figure out how to do this in a criteria

		List<Company> filteredList = list.stream().filter(c -> {
			boolean hasParentOrganization = c.getActingAs().stream().anyMatch(parentOrganizationPredicate());
			boolean hasInternalOrganization = c.getActingAs().stream().anyMatch(internalOrganizationPredicate());
			return hasParentOrganization && hasInternalOrganization;
		}).collect(Collectors.toList());
		return filteredList.isEmpty() ? Optional.empty() : Optional.ofNullable(filteredList.get(0));

	}

	public static final Predicate<PartyRole> internalOrganizationPredicate() {
		Predicate<PartyRole> isInternalOrganization = a -> (a instanceof InternalOrganization)
				& a.getDateTimeRange().isActive();
		return isInternalOrganization;
	}

	public static final Predicate<PartyRole> parentOrganizationPredicate() {
		Predicate<PartyRole> isParent = a -> (a instanceof ParentOrganization);
		return isParent;
	}
}
