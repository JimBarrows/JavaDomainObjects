package jdo.crm.models;

import jdo.model.AggregateEntity;
import jdo.order.model.SalesOrder;
import jdo.party.model.Party;
import jdo.party.model.relationship.CustomerRelationship;

import java.util.List;

/**
 * A customer is synthetic entity that is a party, and the orders a party has placed for products.
 *
 * @author Jim
 */
public class Customer extends AggregateEntity<Party> {

	private Party party;
	private CustomerRelationship relationshipTo;
	private List<SalesOrder> salesOrders;

	public Customer(Party newParty) {
		super();
		this.party = newParty;
	}

	@Override
	public Party rootAggregate() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public CustomerRelationship getRelationshipTo() {
		return relationshipTo;
	}

	public void setRelationshipTo(CustomerRelationship relationshipTo) {
		this.relationshipTo = relationshipTo;
	}

	public List<SalesOrder> getSalesOrders() {
		return salesOrders;
	}

	public void setSalesOrders(List<SalesOrder> salesOrders) {
		this.salesOrders = salesOrders;
	}

	@Override
	public int hashCode() {
		return getParty().hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Customer)) return false;

		Customer customer = (Customer) o;

		return getParty().equals(customer.getParty());
	}

	public Party getParty() {
		return party;
	}
}
