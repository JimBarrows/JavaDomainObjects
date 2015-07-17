package jdo.core.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import jdo.core.repository.specification.Specification;

public abstract class RepositoryTemplate<E, I> implements Repository<E, I> {	

	/**Type erasure means we can't get the type of a generic, so, we have to do this tomfoolery.
	 * 
	 */
	private Class<E> type;

	abstract protected EntityManager entityManager() ;
	
	@Override
	public E create(E entity) {
		entityManager().persist(entity);
		return entity;
	}

	@Override
	public Optional<E> findById(I id) {
		return Optional.ofNullable(entityManager().find(type, id));
	}

	@Override
	public List<E> findBy(Specification<E> specification, Optional<Integer> startAt, Optional<Integer> maxNumberToReturn) {
		List<E> found = new ArrayList<E>(); 
		findAll(startAt, maxNumberToReturn).forEach(p -> {
			if( specification.isSatisfiedBy( p)) {
				found.add(p);
			}
		});
		return found;
	}

	@Override
	public List<E> findBy(Specification<E> specification) {		
		return findBy( specification, Optional.empty(), Optional.empty());
	}

	@Override
	public List<E> findAll() { 
		return findAll( Optional.empty(), Optional.empty());
	}

	@Override
	public List<E> findAll(Optional<Integer> startAt, Optional<Integer> maxNumbertoReturn) {
		CriteriaBuilder builder = entityManager().getCriteriaBuilder();
		CriteriaQuery<E> criteria = builder.createQuery( type );
		Root<E> entityRoot = criteria.from( type );
		criteria.select( entityRoot );
		TypedQuery<E> query = entityManager().createQuery( criteria );
		startAt.map(s -> query.setFirstResult(s));
		maxNumbertoReturn.map( m -> query.setMaxResults(m));
		List<E> entities = query.getResultList();
		return entities;
	}

	@Override
	public E update(E entity) {		
		return entityManager().merge(entity);
	}

	@Override
	public void delete(I id) {
		E found = entityManager().find(type, id);
		entityManager().remove(found);

	}

	public RepositoryTemplate(Class<E> type) {
		super();
		this.type = type;
	}	

}
