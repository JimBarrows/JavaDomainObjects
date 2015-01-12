package jdo.order.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.party.model.PartyRole;
import jdo.party.model.contactmechanism.ContactMechanism;

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

	@ManyToOne
	private PartyRole billTo;

	@ManyToOne
	private ContactMechanism designatedToBeBilledTo;

	@ManyToOne
	private PartyRole placedBy;

	@ManyToOne
	private ContactMechanism placedUsingMechanism;

	@ManyToOne
	private PartyRole takenBy;

	@ManyToOne
	private ContactMechanism takenVia;

	public PartyRole getBillTo() {
		return billTo;
	}

	public ContactMechanism getDesignatedToBeBilledTo() {
		return designatedToBeBilledTo;
	}

	public PartyRole getPlacedBy() {
		return placedBy;
	}

	public ContactMechanism getPlacedUsingMechanism() {
		return placedUsingMechanism;
	}

	public PartyRole getTakenBy() {
		return takenBy;
	}

	public ContactMechanism getTakenVia() {
		return takenVia;
	}

	public void setBillTo(PartyRole billTo) {
		this.billTo = billTo;
	}

	public void setDesignatedToBeBilledTo(
			ContactMechanism designatedToBeBilledTo) {
		this.designatedToBeBilledTo = designatedToBeBilledTo;
	}

	public void setPlacedBy(PartyRole placedBy) {
		this.placedBy = placedBy;
	}

	public void setPlacedUsingMechanism(ContactMechanism placedUsing) {
		this.placedUsingMechanism = placedUsing;
	}

	public void setTakenBy(PartyRole takenBy) {
		this.takenBy = takenBy;
	}

	public void setTakenVia(ContactMechanism takenVia) {
		this.takenVia = takenVia;
	}

}