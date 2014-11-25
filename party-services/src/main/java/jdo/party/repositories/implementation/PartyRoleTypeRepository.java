package jdo.party.repositories.implementation;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import jdo.core.repository.specification.Specification;
import jdo.party.model.PartyRoleType;

@Stateful
public class PartyRoleTypeRepository implements jdo.party.repositories.PartyRoleTypeRepository{

	@PersistenceContext(name = "all-models", type = PersistenceContextType.EXTENDED)
	private EntityManager	em;

	@Override
	public PartyRoleType create(PartyRoleType entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public PartyRoleType findById(Long id) {
		return em.find(PartyRoleType.class, id);
	}

	@Override
	public List<PartyRoleType> findBy(Specification<PartyRoleType> specification) {
		List<PartyRoleType> found = new ArrayList<PartyRoleType>(); 
		findAll().forEach(p -> {
			if( specification.isSatisifiedBy( p)) {
				found.add(p);
			}
		});
		return found;
	}
	
	@Override
	public List<PartyRoleType> findAll() {		
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<PartyRoleType> criteria = builder.createQuery( PartyRoleType.class );
		Root<PartyRoleType> PartyRoleType = criteria.from( PartyRoleType.class );
		criteria.select( PartyRoleType );		
		List<PartyRoleType> parties = em.createQuery( criteria ).getResultList();
		return parties;
	}

	@Override
	public PartyRoleType update(PartyRoleType entity) {
		PartyRoleType mergePartyRoleType = em.merge(entity);
		return mergePartyRoleType;
	}

	@Override
	public void delete(PartyRoleType entity) {
		PartyRoleType mergePartyRoleType = em.merge(entity);
		em.refresh(mergePartyRoleType);
		em.remove(mergePartyRoleType);

	}

	public PartyRoleTypeRepository(EntityManager em) {
		super();
		this.em = em;
	}

	public PartyRoleTypeRepository() {
		super();		
	}	

}
