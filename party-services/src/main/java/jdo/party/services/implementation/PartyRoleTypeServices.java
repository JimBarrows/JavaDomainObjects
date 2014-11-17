package jdo.party.services.implementation;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import jdo.party.model.PartyRoleType;


@Stateless
public class PartyRoleTypeServices implements jdo.party.services.PartyRoleTypeServices{
	@PersistenceContext(name = "all-models")
	private EntityManager	em;

	@Override
	public List<PartyRoleType> list(int firstResult, int maxResults) {
		if ((firstResult < 0) || (maxResults <= 0))
			throw new IllegalArgumentException(
					"First Result and max results must be positive. Max results cannot be 0");
		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<PartyRoleType> criteria = builder.createQuery( PartyRoleType.class );
		Root<PartyRoleType> partyRoleType = criteria.from( PartyRoleType.class );
		criteria.select( partyRoleType );		
		List<PartyRoleType> people = em.createQuery( criteria ).getResultList();
		return people;
	}
}
