package jdo.party.services.implementation;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jdo.party.model.PartyRoleType;


@Stateless
public class PartyRoleTypeCrudServices implements jdo.party.services.PartyRoleTypeCrudServices {

	@PersistenceContext(name = "all-models")
	private EntityManager	em;
	
	@Override
	public void delete(PartyRoleType partyRoleType) {
		PartyRoleType mergeParty = em.merge(partyRoleType);
		em.refresh(mergeParty);
		em.remove(mergeParty);
		
	}

	@Override
	public void create(PartyRoleType partyRoleType) {
		em.persist(partyRoleType);
		
	}

	@Override
	public PartyRoleType update(PartyRoleType partyRoleType) {
		return em.merge(partyRoleType);
		
	}
	
	@Override
	public PartyRoleType read(Long id) {
		return em.find(PartyRoleType.class, id);
	}

}
