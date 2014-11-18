package jdo.party.services.implementation;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.validation.ValidationException;

import jdo.party.model.Party;

/**
 * Provides the 4 basic crud services, and not much else.
 * 
 * @author jimbarrows
 * 
 */
@Stateless
public class PartyCrudServices implements jdo.party.services.PartyCrudServices {

	@PersistenceContext(name = "all-models", type=PersistenceContextType.EXTENDED)
	private EntityManager	em;
	
	
	@Override
	public Party create(Party party) {

		em.persist(party);
		return party;
	}

	@Override
	public Party read(Long id) {
		return em.find(Party.class, id);
	}

	@Override
	public Party update(Party party) throws ValidationException {
		Party mergeParty = em.merge(party);		
		return mergeParty;
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public void delete(Party party) {

		Party mergeParty = em.merge(party);
		em.refresh(mergeParty);
		em.remove(mergeParty);
	}

	public PartyCrudServices() {
		super();
	}

	public PartyCrudServices(EntityManager em) {
		super();
		this.em = em;
	}
}
