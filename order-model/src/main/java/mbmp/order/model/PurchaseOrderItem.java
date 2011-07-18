package mbmp.order.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import mbmp.party.model.PartyRole;
import mbmp.party.model.contactmechanism.ContactMechanism;

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

	private PartyRole designatedShipTo;
	
	private ContactMechanism shipToMechanism;
	
	private List<SalesOrderItem> usedToFillfill = new ArrayList<SalesOrderItem>();

	@ManyToOne
	public PartyRole getDesignatedShipTo() {
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