package jdo.crm.model;

import jdo.party.model.Person;

/**
 * A person as a customer.
 *
 * @author Jim
 *
 */
public class PersonCustomer extends CustomerAggregate<Person> {

	public PersonCustomer() {
		super();
	}

	public PersonCustomer(final Person customer) {
		super(customer);
	}

}
