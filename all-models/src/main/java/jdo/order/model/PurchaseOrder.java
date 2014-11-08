package jdo.order.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.party.model.PartyRole;
import jdo.party.model.contactmechanism.ContactMechanism;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:37 AM
 */
@SuppressWarnings("serial")
@Entity
public class PurchaseOrder extends Order {

	private ContactMechanism billedTo;
	
	private PartyRole placedBy;
	
	private ContactMechanism placedUsing;
	
	private PartyRole requestedBillTo;

	private PartyRole takenBy;
	
	private ContactMechanism takenVia;

	@ManyToOne
	public ContactMechanism getBilledTo() {
		return billedTo;
	}

	@ManyToOne
	public PartyRole getPlacedBy() {
		return placedBy;
	}

	@ManyToOne
	public ContactMechanism getPlacedUsing() {
		return placedUsing;
	}

	@ManyToOne
	public PartyRole getRequestedBillTo() {
		return requestedBillTo;
	}

	@ManyToOne
	public PartyRole getTakenBy() {
		return takenBy;
	}

	@ManyToOne
	public ContactMechanism getTakenVia() {
		return takenVia;
	}

	public void setBilledTo(ContactMechanism billedTo) {
		this.billedTo = billedTo;
	}

	public void setPlacedBy(PartyRole placerOf) {
		this.placedBy = placerOf;
	}

	public void setPlacedUsing(ContactMechanism placedUser) {
		this.placedUsing = placedUser;
	}

	public void setRequestedBillTo(PartyRole requestedBillTo) {
		this.requestedBillTo = requestedBillTo;
	}

	public void setTakenBy(PartyRole fullfillerOf) {
		this.takenBy = fullfillerOf;
	}

	public void setTakenVia(ContactMechanism takenVia) {
		this.takenVia = takenVia;
	}
}