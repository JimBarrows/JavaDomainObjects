package jdo.order.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

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

	/**
	 * UUID of the ContaceMechanism.
	 * 
	 */
	private UUID shippedToMechanism;

	/**
	 * of the PartyRole.
	 * 
	 */
	private UUID shipToCustomer;

	public List<PurchaseOrderItem> getAssociatedWith() {
		return associatedWith;
	}

	public UUID getShippedToMechanism() {
		return shippedToMechanism;
	}

	public UUID getShipToCustomer() {
		return shipToCustomer;
	}

	public void setAssociatedWith(List<PurchaseOrderItem> associatedWith) {
		this.associatedWith = associatedWith;
	}

	public void setShippedToMechanism(UUID designatedToBeShippedTo) {
		this.shippedToMechanism = designatedToBeShippedTo;
	}

	public void setShipToCustomer(UUID shipToCustomer) {
		this.shipToCustomer = shipToCustomer;
	}

}