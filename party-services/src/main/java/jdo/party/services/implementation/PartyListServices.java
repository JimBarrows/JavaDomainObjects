package jdo.party.services.implementation;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jdo.party.model.Party;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;

/**
 * This service returns a list of all parties, either the entire list, or
 * paginated. It provides no searching, and no sorting capability.
 * 
 * @author jimbarrows
 * 
 */
@Stateless
public class PartyListServices implements jdo.party.services.PartyListServices {	

	@PersistenceContext(name = "all-models")
	private EntityManager	em;

	public long partyCount() {

		long returnlong = (Long) em.createQuery(
				"select count(*) from Party").getSingleResult();
		return returnlong;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Party> list(int firstResult, int maxResults) {

		if ((firstResult < 0) || (maxResults <= 0))
			throw new IllegalArgumentException(
					"First Result and max results must be positive. Max results cannot be 0");
		
		
		List<Party> partyList = em.createQuery("from Party").setFirstResult(firstResult)
				.setMaxResults(maxResults).getResultList();		

		return partyList;

	}

	public PartyListServices() {
		super();
	}	

}
