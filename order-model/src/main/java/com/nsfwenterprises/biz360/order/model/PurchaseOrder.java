package com.nsfwenterprises.biz360.order.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.party.model.contactmechanism.ContactMechanism;
import com.nsfwenterprises.biz360.party.model.role.BillToPurchaser;
import com.nsfwenterprises.biz360.party.model.role.PlacingBuyer;
import com.nsfwenterprises.biz360.party.model.role.Supplier;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:37 AM
 */
@SuppressWarnings("serial")
@Entity
public class PurchaseOrder extends Order {

	private ContactMechanism billedTo;
	
	private PlacingBuyer placedBy;
	
	private ContactMechanism placedUsing;
	
	private BillToPurchaser requestedBillTo;

	private Supplier takenBy;
	
	private ContactMechanism takenVia;

	@ManyToOne
	public ContactMechanism getBilledTo() {
		return billedTo;
	}

	@ManyToOne
	public PlacingBuyer getPlacedBy() {
		return placedBy;
	}

	@ManyToOne
	public ContactMechanism getPlacedUsing() {
		return placedUsing;
	}

	@ManyToOne
	public BillToPurchaser getRequestedBillTo() {
		return requestedBillTo;
	}

	@ManyToOne
	public Supplier getTakenBy() {
		return takenBy;
	}

	@ManyToOne
	public ContactMechanism getTakenVia() {
		return takenVia;
	}

	public void setBilledTo(ContactMechanism billedTo) {
		this.billedTo = billedTo;
	}

	public void setPlacedBy(PlacingBuyer placerOf) {
		this.placedBy = placerOf;
	}

	public void setPlacedUsing(ContactMechanism placedUser) {
		this.placedUsing = placedUser;
	}

	public void setRequestedBillTo(BillToPurchaser requestedBillTo) {
		this.requestedBillTo = requestedBillTo;
	}

	public void setTakenBy(Supplier fullfillerOf) {
		this.takenBy = fullfillerOf;
	}

	public void setTakenVia(ContactMechanism takenVia) {
		this.takenVia = takenVia;
	}
}