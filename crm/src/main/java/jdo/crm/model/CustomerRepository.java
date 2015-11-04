package jdo.crm.model;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jdo.application.ApplicationConfiguration;
import jdo.core.repository.Repository;
import jdo.core.repository.specification.Specification;
import jdo.party.model.Party;
import jdo.party.model.relationship.CustomerRelationship;
import jdo.party.model.roles.Customer;
import jdo.party.model.roles.InternalOrganization;

/**
 * Repository for the Customer Aggregate class.
 *
 * @author Jim
 *
 */
@Stateful
public class CustomerRepository implements Repository<Aggregate> {

	/**
	 * JPA2 entity manager.
	 */
	@PersistenceContext
	private EntityManager entityManager;

	@EJB
	private ApplicationConfiguration applicationConfiguration;

	@Override
	public Aggregate create(final Aggregate aggregate) {
		final CustomerAggregate<Party> customerAggregate = ( CustomerAggregate<Party> ) aggregate;
		final Party customer = customerAggregate.getCustomer();
		final Customer customerRole = new Customer();
		final InternalOrganization vendorRole = ( InternalOrganization ) applicationConfiguration.company()
				.activeRole(InternalOrganization.class).orElseThrow(() -> new IllegalStateException(
						"Expected the owning company to have an internalOrganization role, and it doesn't"));
		final CustomerRelationship customerRelationship = new CustomerRelationship(vendorRole, customerRole);

		customer.addPartyRole(customerRole);

		entityManager.persist(customer);
		entityManager.persist(customerRelationship);

		customerAggregate.setCustomer(customer);
		return aggregate;
	}

	@Override
	public void delete(final UUID id) {
		entityManager.remove(entityManager.find(Party.class, id));

	}

	@Override
	public List<Aggregate> findAll(final Optional<Integer> startAt, final Optional<Integer> maxNumbertoReturn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aggregate> findBy(final Specification<Aggregate> specification, final Optional<Integer> startAt,
			final Optional<Integer> maxNumbertoReturn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Aggregate> findById(final UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aggregate update(final Aggregate entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
