package jdo.crm.repositories;

import jdo.core.repository.Repository;
import jdo.core.repository.specification.Specification;
import jdo.crm.models.Customer;
import jdo.party.model.Party;
import jdo.party.repositories.PartyRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class CustomerRepository implements Repository<Customer, UUID> {

	private PartyRepository partyRepository;

	/**
	 * Create the entity in the repository.
	 *
	 * @param entity The entity with no id (ie not saved yet)
	 * @return The entity with the id.
	 */
	@Override
	public Customer create(Customer entity) {
		Party newParty = partyRepository.create(entity.getParty());
		return new Customer(newParty);
	}

	/**
	 * Find an entity.
	 *
	 * @param id The id of the entity.
	 * @return Either none, if the entity is not found, or some entity.
	 */
	@Override
	public Optional<Customer> findById(UUID id) {
		return null;
	}

	/**
	 * Find an entity by a specification, and return a page of the results, starting at the page number, and going until maxNumberToReturn.
	 *
	 * @param specification     The specification of what we're looking for.
	 * @param startAt           The page to start at.
	 * @param maxNumbertoReturn The maximum number of results in a page.
	 * @return a the maximum number of entities as specified.
	 */
	@Override
	public List<Customer> findBy(Specification<Customer> specification, Optional<Integer> startAt, Optional<Integer> maxNumbertoReturn) {
		return null;
	}

	/**
	 * Find all the entities and return that page.
	 *
	 * @param startAt           The page.
	 * @param maxNumbertoReturn The max number
	 * @return The page of results.
	 */
	@Override
	public List<Customer> findAll(Optional<Integer> startAt, Optional<Integer> maxNumbertoReturn) {
		return null;
	}

	/**
	 * Find an entity by a specification and return all the results.
	 *
	 * @param specification Specify what you want to find.
	 * @return the list of things found.
	 */
	@Override
	public List<Customer> findBy(Specification<Customer> specification) {
		return null;
	}

	/**
	 * Find everything and return it.
	 *
	 * @return the whole list.
	 */
	@Override
	public List<Customer> findAll() {
		return null;
	}

	/**
	 * UPdate an entity with new fields.
	 *
	 * @param entity with changed data.
	 * @return the modified entity.
	 */
	@Override
	public Customer update(Customer entity) {
		return null;
	}

	/**
	 * Delete an entity by the id.
	 *
	 * @param id of the entity.
	 */
	@Override
	public void delete(UUID id) {

	}
}
