package jdo.application;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import jdo.party.model.Company;
import jdo.party.model.PartyRole;
import jdo.party.model.roles.InternalOrganization;
import jdo.party.model.roles.ParentOrganization;

@Singleton
public class ApplicationConfiguration {

	@PersistenceContext(name = "PeopleAndOrganizations")
	private EntityManager	entityManager;

	private Company			company;

	public Company getCompany() {
		return company;
	}

	@PostConstruct
	public void configure() {
		company = findCompany().orElse(newParentInternalCompany());
	}

	private Company newParentInternalCompany() {
		Company company = new Company();
		company.setName("The company in question");
		company.addPartyRole(new InternalOrganization());
		company.addPartyRole(new ParentOrganization());
		entityManager.persist(company);
		return company;
	}

	public Optional<Company> findCompany() {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Company> criteria = builder.createQuery(Company.class);
		Root<Company> entityRoot = criteria.from(Company.class);
		criteria.select(entityRoot);

		TypedQuery<Company> query = entityManager.createQuery(criteria);
		List<Company> list = query.getResultList();
		//I couldn't figure out the freaking JPA criteria.. this was easier :) 
		//TODO Figure out how to do this in a criteria		

		Stream<Company> filter = list.stream().filter(c -> c.getActingAs().stream().anyMatch(parentOrganizationPredicate()))
				.filter(c -> c.getActingAs().stream().anyMatch(internalOrganizationPredicate()));
		return filter.findFirst();

	}

	public static final Predicate<PartyRole> internalOrganizationPredicate() {
		Predicate<PartyRole> isInternalOrganization = a -> (a instanceof InternalOrganization) & a.getDateTimeRange().isActive();
		return isInternalOrganization;
	}
	
	public static final Predicate<PartyRole> parentOrganizationPredicate() {
		Predicate<PartyRole> isParent = a -> (a instanceof ParentOrganization);
		return isParent;
	}
}
