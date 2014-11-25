package jdo.core.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import jdo.core.repository.specification.Specification;

public class RepositoryTemplate<E, I> implements Repository<E, I> {

	@PersistenceContext(name = "all-models", type = PersistenceContextType.EXTENDED)
	private EntityManager em;

	/**Type erasure means we can't get the type of a generic, so, we have to do this tomfoolery.
	 * 
	 */
	private Class<E> type;

	@Override
	public E create(E entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public E findById(I id) {
		return em.find(type, id);
	}

	@Override
	public List<E> findBy(Specification<E> specification) {
		List<E> found = new ArrayList<E>(); 
		findAll().forEach(p -> {
			if( specification.isSatisifiedBy( p)) {
				found.add(p);
			}
		});
		return found;
	}

	@Override
	public List<E> findAll() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<E> criteria = builder.createQuery( type );
		Root<E> entityRoot = criteria.from( type );
		criteria.select( entityRoot );		
		List<E> entities = em.createQuery( criteria ).getResultList();
		return entities;
	}

	@Override
	public E update(E entity) {		
		return em.merge(entity);
	}

	@Override
	public void delete(E entity) {
		E mergedEntity = em.merge(entity);
		em.refresh(mergedEntity);
		em.remove(mergedEntity);

	}

	public RepositoryTemplate(Class<E> type) {
		super();
		this.type = type;
	}

	public RepositoryTemplate(EntityManager em, Class<E> type) {
		super();
		this.em = em;
		this.type = type;
	}

}
