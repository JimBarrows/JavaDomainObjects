package jdo.crm.model;

import jdo.party.model.Organization;

/**
 * Organization as a customer.
 *
 * @author Jim
 *
 */
public class OrganizationCustomer extends CustomerAggregate<Organization> {

	public OrganizationCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrganizationCustomer(final Organization customer) {
		super(customer);
		// TODO Auto-generated constructor stub
	}

}
