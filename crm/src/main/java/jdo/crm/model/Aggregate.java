package jdo.crm.model;

import java.util.List;
import java.util.UUID;

import jdo.party.model.Party;

public interface Aggregate {

	/**
	 * ID for the customer.
	 *
	 * @return the id for the customer
	 */
	UUID getId();

	/**
	 * Convenience method for getting all the customers vendors. All vendors
	 * will be internal organizations.
	 *
	 * @return a list of vendors to which the party is a customer of.
	 */
	List<Party> vendors();

}
