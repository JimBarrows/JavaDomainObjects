package jdo.order.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import jdo.party.model.PartyRole;
import jdo.party.model.contactmechanism.ContactMechanism;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:38 AM
 */
@Entity
public class SalesOrderItem extends OrderItem {

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;

	private List<PurchaseOrderItem>	associatedWith		= new ArrayList<PurchaseOrderItem>();

	private ContactMechanism		shippedToMechanism;

	private PartyRole				shipToCustomer;

	@ManyToMany(mappedBy = "usedToFillfill")
	public List<PurchaseOrderItem> getAssociatedWith() {
		return associatedWith;
	}

	@ManyToOne
	public ContactMechanism getShippedToMechanism() {
		return shippedToMechanism;
	}

	@ManyToOne
	public PartyRole getShipToCustomer() {
		return shipToCustomer;
	}

	public void setAssociatedWith(List<PurchaseOrderItem> associatedWith) {
		this.associatedWith = associatedWith;
	}

	public void setShippedToMechanism(ContactMechanism designatedToBeShippedTo) {
		this.shippedToMechanism = designatedToBeShippedTo;
	}

	public void setShipToCustomer(PartyRole shipToCustomer) {
		this.shipToCustomer = shipToCustomer;
	}

}