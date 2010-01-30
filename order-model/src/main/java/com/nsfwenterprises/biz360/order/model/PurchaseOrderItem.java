package com.nsfwenterprises.biz360.order.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.party.model.contactmechanism.ContactMechanism;
import com.nsfwenterprises.biz360.party.model.role.ShipToBuyer;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:37 AM
 */
@Entity
public class PurchaseOrderItem extends OrderItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ShipToBuyer designatedShipTo;
	
	private ContactMechanism shipToMechanism;
	
	private List<SalesOrderItem> usedToFillfill = new ArrayList<SalesOrderItem>();

	@ManyToOne
	public ShipToBuyer getDesignatedShipTo() {
		return designatedShipTo;
	}

	@ManyToOne
	public ContactMechanism getShipToMechanism() {
		return shipToMechanism;
	}

	@ManyToMany
	public List<SalesOrderItem> getUsedToFillfill() {
		return usedToFillfill;
	}

	public void setDesignatedShipTo(ShipToBuyer requestedShipTo) {
		this.designatedShipTo = requestedShipTo;
	}

	public void setShipToMechanism(ContactMechanism shipToMechanism) {
		this.shipToMechanism = shipToMechanism;
	}

	public void setUsedToFillfill(List<SalesOrderItem> usedToFillfill) {
		this.usedToFillfill = usedToFillfill;
	}
}