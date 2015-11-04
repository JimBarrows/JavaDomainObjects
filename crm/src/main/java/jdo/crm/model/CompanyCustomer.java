/**
 *
 */
package jdo.crm.model;

import jdo.party.model.Company;

/**
 * @author Jim
 *
 */
public class CompanyCustomer extends CustomerAggregate<Company> {

	public CompanyCustomer() {
		super();
	}

	public CompanyCustomer(final Company customer) {
		super(customer);
	}

}
