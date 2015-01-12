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
 * @created 25-Dec-2007 9:54:37 AM
 */
@Entity
public class PurchaseOrderItem extends OrderItem {

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;

	@ManyToOne
	private PartyRole				designatedShipTo;

	@ManyToOne
	private ContactMechanism		shipToMechanism;

	@ManyToMany
	private List<SalesOrderItem>	usedToFillfill		= new ArrayList<SalesOrderItem>();

	
	public PartyRole getDesignatedShipTo() {
		return designatedShipTo;
	}

	
	public ContactMechanism getShipToMechanism() {
		return shipToMechanism;
	}

	
	public List<SalesOrderItem> getUsedToFillfill() {
		return usedToFillfill;
	}

	public void setDesignatedShipTo(PartyRole requestedShipTo) {
		this.designatedShipTo = requestedShipTo;
	}

	public void setShipToMechanism(ContactMechanism shipToMechanism) {
		this.shipToMechanism = shipToMechanism;
	}

	public void setUsedToFillfill(List<SalesOrderItem> usedToFillfill) {
		this.usedToFillfill = usedToFillfill;
	}
}