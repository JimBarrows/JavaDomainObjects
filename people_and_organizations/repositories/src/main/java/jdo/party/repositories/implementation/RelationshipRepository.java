package jdo.party.repositories.implementation;

import jdo.core.repository.DatabaseRepositoryTemplate;
import jdo.party.model.relationship.CustomerRelationship;
import jdo.party.model.relationship.PartyRelationship;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Stateful
public class RelationshipRepository extends DatabaseRepositoryTemplate<PartyRelationship, UUID> implements jdo.party.repositories.RelationshipRepository {

	@PersistenceContext(name = "PeopleAndOrganizations")
	protected EntityManager em;
	
	public RelationshipRepository() {
		super(PartyRelationship.class); 
	}

	@Override
	protected EntityManager entityManager() {
		return em;
	}

	@Override
	public List<CustomerRelationship> findAllCustomersRelationships(Optional<Integer> startPosition, Optional<Integer> maxResult) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<CustomerRelationship> criteria = builder
				.createQuery(CustomerRelationship.class);
		Root<CustomerRelationship> entityRoot = criteria
				.from(CustomerRelationship.class);
		criteria.select(entityRoot);
		TypedQuery<CustomerRelationship> query = em.createQuery(criteria);
		startPosition.map(s -> query.setFirstResult(s));
		maxResult.map( m -> query.setMaxResults(m));
		return query.getResultList();
	}
}
