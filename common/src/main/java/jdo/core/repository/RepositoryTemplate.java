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
import jdo.model.BasePersistentModel;

/**
 * A template for the basic functionality a repository needs.
 * 
 * @author Jim
 *
 * @param <E>
 *            The Entity type the Repository is for.
 * @param <I>
 *            The id type the entity uses.
 */
public abstract class RepositoryTemplate<E extends BasePersistentModel, I> implements Repository<E, I> {

    /**
     * Type erasure means we can't get the type of a generic, so, we have to do
     * this tomfoolery.
     * 
     */
    private Class<E> type;

    /**
     * The entity manager used by JPA to access the database.
     * 
     * @return the entity manager.
     */
    protected abstract EntityManager entityManager();

    @Override
    public final E create(final E entity) {
	entityManager().persist(entity);
	return entity;
    }

    @Override
    public final Optional<E> findById(final I id) {
	return Optional.ofNullable(entityManager().find(type, id));
    }

    @Override
    public final List<E> findBy(final Specification<E> specification, final Optional<Integer> startAt,
	    final Optional<Integer> maxNumberToReturn) {
	List<E> found = new ArrayList<E>();
	findAll(startAt, maxNumberToReturn).forEach(p -> {
	    if (specification.isSatisfiedBy(p)) {
		found.add(p);
	    }
	});
	return found;
    }

    @Override
    public final List<E> findBy(final Specification<E> specification) {
	return findBy(specification, Optional.empty(), Optional.empty());
    }

    @Override
    public final List<E> findAll() {
	return findAll(Optional.empty(), Optional.empty());
    }

    @Override
    public final List<E> findAll(final Optional<Integer> startAt, final Optional<Integer> maxNumbertoReturn) {
	CriteriaBuilder builder = entityManager().getCriteriaBuilder();
	CriteriaQuery<E> criteria = builder.createQuery(type);
	Root<E> entityRoot = criteria.from(type);
	criteria.select(entityRoot);
	TypedQuery<E> query = entityManager().createQuery(criteria);
	startAt.map(s -> query.setFirstResult(s));
	maxNumbertoReturn.map(m -> query.setMaxResults(m));
	List<E> entities = query.getResultList();
	return entities;
    }

    @Override
    public final E update(final E entity) {
	return entityManager().merge(entity);
    }

    @Override
    public final void delete(final I id) {
	E found = entityManager().find(type, id);
	entityManager().remove(found);

    }

    /**
     * Constructor needs the type, because of type erasure. Stupid Java
     * 
     * @param newType
     *            The type of the entity
     */
    public RepositoryTemplate(final Class<E> newType) {
	super();
	this.type = newType;
    }

}
