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
	private static final long serialVersionUID = 1L;

	@ManyToMany(mappedBy = "usedToFillfill")
	private List<PurchaseOrderItem> associatedWith = new ArrayList<PurchaseOrderItem>();

	@ManyToOne
	private ContactMechanism shippedToMechanism;

	@ManyToOne
	private PartyRole shipToCustomer;

	public List<PurchaseOrderItem> getAssociatedWith() {
		return associatedWith;
	}

	public ContactMechanism getShippedToMechanism() {
		return shippedToMechanism;
	}

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