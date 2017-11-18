package jdo.core.repository;

import jdo.core.repository.specification.Specification;
import jdo.model.Entity;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * A template for the basic functionality a repository needs.
 *
 * @param <E> The Entity type the Repository is for.
 * @param <I> The id type the entity uses.
 * @author Jim
 */
public abstract class DatabaseRepositoryTemplate<E extends Entity, I> implements Repository<E, I> {

	/**
	 * Type erasure means we can't get the type of a generic, so, we have to do
	 * this tomfoolery.
	 */
	private final Class<E> type;

	/**
	 * The entity manager used by JPA to access the database.
	 *
	 * @return the entity manager.
	 */
	protected abstract EntityManager entityManager();

	@Override
	public E create(final E entity) {
		entityManager().persist(entity);
		return entity;
	}

	@Override
	public Optional<E> findById(final I id) {
		return Optional.ofNullable(entityManager().find(type, id));
	}

	/**
	 * Constructor needs the type, because of type erasure. Stupid Java
	 *
	 * @param newType The type of the entity
	 */
	public DatabaseRepositoryTemplate(final Class<E> newType) {
		super();
		this.type = newType;
	}

	@Override
	public List<E> findBy(final Specification<E> specification) {
		return findBy(specification, Optional.empty(), Optional.empty());
	}

	@Override
	public List<E> findAll() {
		return findAll(Optional.empty(), Optional.empty());
	}

	@Override
	public List<E> findAll(final Optional<Integer> startAt, final Optional<Integer> maxNumbertoReturn) {
		final CriteriaBuilder builder = entityManager().getCriteriaBuilder();
		final CriteriaQuery<E> criteria = builder.createQuery(type);
		final Root<E> entityRoot = criteria.from(type);
		criteria.select(entityRoot);
		final TypedQuery<E> query = entityManager().createQuery(criteria);
		startAt.map(s -> query.setFirstResult(s));
		maxNumbertoReturn.map(m -> query.setMaxResults(m));
		final List<E> entities = query.getResultList();
		return entities;
	}

	@Override
	public E update(final E entity) {
		return entityManager().merge(entity);
	}

	@Override
	public void delete(final I id) {
		final E found = entityManager().find(type, id);
		entityManager().remove(found);

	}

	@Override
	public List<E> findBy(final Specification<E> specification, final Optional<Integer> startAt,
	                      final Optional<Integer> maxNumberToReturn) {
		final List<E> found = new ArrayList<E>();
		findAll(startAt, maxNumberToReturn).forEach(p -> {
			if (specification.isSatisfiedBy(p)) {
				found.add(p);
			}
		});
		return found;
	}

}
