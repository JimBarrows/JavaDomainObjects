package com.nsfwenterprises.biz360.order.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.party.model.contactmechanism.ContactMechanism;
import com.nsfwenterprises.biz360.party.model.role.ShipToCustomer;

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
	
	private List<PurchaseOrderItem> associatedWith = new ArrayList<PurchaseOrderItem>();
	
	private ContactMechanism shippedToMechanism;
	
	private ShipToCustomer shipToCustomer;	

	@ManyToMany(mappedBy="usedToFillfill")
	public List<PurchaseOrderItem> getAssociatedWith() {
		return associatedWith;
	}


	@ManyToOne
	public ContactMechanism getShippedToMechanism() {
		return shippedToMechanism;
	}

	@ManyToOne
	public ShipToCustomer getShipToCustomer() {
		return shipToCustomer;
	}

	public void setAssociatedWith(List<PurchaseOrderItem> associatedWith) {
		this.associatedWith = associatedWith;
	}

	public void setShippedToMechanism(ContactMechanism designatedToBeShippedTo) {
		this.shippedToMechanism = designatedToBeShippedTo;
	}

	public void setShipToCustomer(ShipToCustomer shipToCustomer) {
		this.shipToCustomer = shipToCustomer;
	}

	
}