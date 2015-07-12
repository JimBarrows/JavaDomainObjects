package jdo.order.model;

import java.util.UUID;

import javax.persistence.Entity;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:38 AM
 */
@Entity
public class SalesOrder extends Order {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** UUID of the PartyRole.
	 * 
	 */
	private UUID billTo;

	/**UUID of the ContactMechanism.
	 * 
	 */
	private UUID designatedToBeBilledTo;

	/**UUID of the PartyRole.
	 * 
	 */
	private UUID placedBy;

	/**UUID of the ContactMechanism.
	 * 
	 */
	private UUID placedUsingMechanism;

	/**UUID of the PartyRole.
	 * 
	 */
	private UUID takenBy;

	/**UUID of the contactMechansim.
	 * 
	 */
	private UUID takenVia;

	public UUID getBillTo() {
		return billTo;
	}

	public UUID getDesignatedToBeBilledTo() {
		return designatedToBeBilledTo;
	}

	public UUID getPlacedBy() {
		return placedBy;
	}

	public UUID getPlacedUsingMechanism() {
		return placedUsingMechanism;
	}

	public UUID getTakenBy() {
		return takenBy;
	}

	public UUID getTakenVia() {
		return takenVia;
	}

	public void setBillTo(UUID billTo) {
		this.billTo = billTo;
	}

	public void setDesignatedToBeBilledTo(
			UUID designatedToBeBilledTo) {
		this.designatedToBeBilledTo = designatedToBeBilledTo;
	}

	public void setPlacedBy(UUID placedBy) {
		this.placedBy = placedBy;
	}

	public void setPlacedUsingMechanism(UUID placedUsing) {
		this.placedUsingMechanism = placedUsing;
	}

	public void setTakenBy(UUID takenBy) {
		this.takenBy = takenBy;
	}

	public void setTakenVia(UUID takenVia) {
		this.takenVia = takenVia;
	}

}