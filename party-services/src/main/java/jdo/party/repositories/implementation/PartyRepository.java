package jdo.party.repositories.implementation;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import jdo.core.repository.specification.Specification;
import jdo.party.model.Party;

@Stateful
public class PartyRepository implements jdo.party.repositories.PartyRepository {

	@PersistenceContext(name = "all-models", type = PersistenceContextType.EXTENDED)
	private EntityManager	em;

	@Override
	public Party create(Party entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public Party findById(Long id) {
		return em.find(Party.class, id);
	}

	@Override
	public Party findBy(Specification<Party> specification) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Party> findAll() {		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Party> criteria = builder.createQuery( Party.class );
		Root<Party> party = criteria.from( Party.class );
		criteria.select( party );		
		List<Party> parties = em.createQuery( criteria ).getResultList();
		return parties;
	}

	@Override
	public Party update(Party entity) {
		Party mergeParty = em.merge(entity);
		return mergeParty;
	}

	@Override
	public void delete(Party entity) {
		Party mergeParty = em.merge(entity);
		em.refresh(mergeParty);
		em.remove(mergeParty);

	}

	public PartyRepository(EntityManager em) {
		super();
		this.em = em;
	}

	public PartyRepository() {
		super();		
	}	

}
