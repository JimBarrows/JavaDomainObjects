package jdo.core.repository;

import jdo.core.repository.specification.Specification;
import jdo.model.Entity;

import java.util.List;
import java.util.Optional;

/**
 * The base interface from which all repositories have functionality.
 *
 * @param <E> The Base Persistent model contained in the repo.
 * @param <I> The id type of the Base Persistent Model being contained in the
 *            repo.
 * @author Jim
 */
public interface Repository<E extends Entity, I> {

	/**
	 * Create the entity in the repository.
	 *
	 * @param entity The entity with no id (ie not saved yet)
	 * @return The entity with the id.
	 */
	E create(E entity);

	/**
	 * Find an entity.
	 *
	 * @param id The id of the entity.
	 * @return Either none, if the entity is not found, or some entity.
	 */
	Optional<E> findById(I id);

	/**
	 * Find an entity by a specification, and return a page of the results, starting at the page number, and going until maxNumberToReturn.
	 *
	 * @param specification     The specification of what we're looking for.
	 * @param startAt           The page to start at.
	 * @param maxNumbertoReturn The maximum number of results in a page.
	 * @return a the maximum number of entities as specified.
	 */
	List<E> findBy(Specification<E> specification, Optional<Integer> startAt,
	               Optional<Integer> maxNumbertoReturn);

	/**
	 * Find all the entities and return that page.
	 *
	 * @param startAt           The page.
	 * @param maxNumbertoReturn The max number
	 * @return The page of results.
	 */
	List<E> findAll(Optional<Integer> startAt, Optional<Integer> maxNumbertoReturn);

	/**
	 * Find an entity by a specification and return all the results.
	 *
	 * @param specification Specify what you want to find.
	 * @return the list of things found.
	 */
	List<E> findBy(Specification<E> specification);

	/**
	 * Find everything and return it.
	 *
	 * @return the whole list.
	 */
	List<E> findAll();

	/**
	 * UPdate an entity with new fields.
	 *
	 * @param entity with changed data.
	 * @return the modified entity.
	 */
	E update(E entity);

	/**
	 * Delete an entity by the id.
	 *
	 * @param id of the entity.
	 */
	void delete(I id);
}
