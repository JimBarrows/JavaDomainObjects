package jdo.order.model;

import java.util.UUID;

import javax.persistence.Entity;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:37 AM
 */
@SuppressWarnings("serial")
@Entity
public class PurchaseOrder extends Order {

	/**UUID of the ContactMechanism.
	 * 
	 */
	private UUID	billedTo;

	/**UUID of the PartyRole.
	 * 
	 */
	private UUID			placedBy;

	/**UUID of the ContactMechanism.
	 * 
	 */
	private UUID	placedUsing;

	/**UUID of the PartyRole.
	 * 
	 */
	private UUID			requestedBillTo;

	/**UUID of the PartyRole.
	 * 
	 */
	private UUID			takenBy;

	/**UUID of the ContactMechanism.
	 * 
	 */
	private UUID	takenVia;

	
	public UUID getBilledTo() {
		return billedTo;
	}

	
	public UUID getPlacedBy() {
		return placedBy;
	}

	
	public UUID getPlacedUsing() {
		return placedUsing;
	}
	
	public UUID getRequestedBillTo() {
		return requestedBillTo;
	}


	public UUID getTakenBy() {
		return takenBy;
	}


	public UUID getTakenVia() {
		return takenVia;
	}

	public void setBilledTo(UUID billedTo) {
		this.billedTo = billedTo;
	}

	public void setPlacedBy(UUID placerOf) {
		this.placedBy = placerOf;
	}

	public void setPlacedUsing(UUID placedUser) {
		this.placedUsing = placedUser;
	}

	public void setRequestedBillTo(UUID requestedBillTo) {
		this.requestedBillTo = requestedBillTo;
	}

	public void setTakenBy(UUID fullfillerOf) {
		this.takenBy = fullfillerOf;
	}

	public void setTakenVia(UUID takenVia) {
		this.takenVia = takenVia;
	}
}