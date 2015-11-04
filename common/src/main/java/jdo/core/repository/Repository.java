package jdo.core.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jdo.core.repository.specification.Specification;

/**
 * The base interface from which all repositories have functionality.
 *
 * @author Jim
 *
 * @param <E>
 *            The Base Persistent model contained in the repo.
 */
public interface Repository<E> {

	/**
	 * Create the entity in the repository.
	 *
	 * @param entity
	 *            The entity with no id (ie not saved yet)
	 * @return The entity with the id.
	 */
	E create(E entity);

	/**
	 * Delete an entity by the id.
	 *
	 * @param id
	 *            of the entity.
	 */
	void delete(UUID id);

	/**
	 * Find all the entities and return that page.
	 *
	 * @param startAt
	 *            The page.
	 * @param maxNumbertoReturn
	 *            The max number
	 * @return The page of results.
	 */
	List<E> findAll(Optional<Integer> startAt, Optional<Integer> maxNumbertoReturn);

	/**
	 * Find an entity by a specification, and return a page of the results,
	 * starting at the page number, and going until maxNumberToReturn.
	 *
	 * @param specification
	 *            The specification of what we're looking for.
	 * @param startAt
	 *            The page to start at.
	 * @param maxNumbertoReturn
	 *            The maximum number of results in a page.
	 * @return a the maximum number of entities as specified.
	 */
	List<E> findBy(Specification<E> specification, Optional<Integer> startAt, Optional<Integer> maxNumbertoReturn);

	/**
	 * Find an entity.
	 *
	 * @param id
	 *            The id of the entity.
	 * @return Either none, if the entity is not found, or some entity.
	 */
	Optional<E> findById(UUID id);

	/**
	 * UPdate an entity with new fields.
	 *
	 * @param entity
	 *            with changed data.
	 * @return the modified entity.
	 */
	E update(E entity);
}
