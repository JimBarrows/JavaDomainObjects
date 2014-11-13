package jdo.party.services.implementation;

import javax.ejb.Remove;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
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

	@PersistenceContext(name = "all-models")
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
		return em.merge(party);
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
