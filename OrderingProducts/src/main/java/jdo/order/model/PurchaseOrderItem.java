package jdo.order.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

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

	/**
	 * UUID of PartyRole.
	 * 
	 */
	private UUID designatedShipTo;

	/**
	 * UUID of the ContactMechanism.
	 * 
	 */
	private UUID shipToMechanism;

	@ManyToMany
	private List<SalesOrderItem> usedToFillfill = new ArrayList<SalesOrderItem>();

	public UUID getDesignatedShipTo() {
		return designatedShipTo;
	}

	public UUID getShipToMechanism() {
		return shipToMechanism;
	}

	public List<SalesOrderItem> getUsedToFillfill() {
		return usedToFillfill;
	}

	public void setDesignatedShipTo(UUID requestedShipTo) {
		this.designatedShipTo = requestedShipTo;
	}

	public void setShipToMechanism(UUID shipToMechanism) {
		this.shipToMechanism = shipToMechanism;
	}

	public void setUsedToFillfill(List<SalesOrderItem> usedToFillfill) {
		this.usedToFillfill = usedToFillfill;
	}
}