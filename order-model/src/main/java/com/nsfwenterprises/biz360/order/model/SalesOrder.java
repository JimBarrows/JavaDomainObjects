package com.nsfwenterprises.biz360.order.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.party.model.contactmechanism.ContactMechanism;
import com.nsfwenterprises.biz360.party.model.role.BillToCustomer;
import com.nsfwenterprises.biz360.party.model.role.InternalOrganization;
import com.nsfwenterprises.biz360.party.model.role.PlacingCustomer;

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

	private BillToCustomer billTo;

	private ContactMechanism designatedToBeBilledTo;

	private PlacingCustomer placedBy;

	private ContactMechanism placedUsingMechanism;

	private InternalOrganization takenBy;

	private ContactMechanism takenVia;

	@ManyToOne
	public BillToCustomer getBillTo() {
		return billTo;
	}

	@ManyToOne
	public ContactMechanism getDesignatedToBeBilledTo() {
		return designatedToBeBilledTo;
	}

	@ManyToOne
	public PlacingCustomer getPlacedBy() {
		return placedBy;
	}

	@ManyToOne
	public ContactMechanism getPlacedUsingMechanism() {
		return placedUsingMechanism;
	}

	@ManyToOne
	public InternalOrganization getTakenBy() {
		return takenBy;
	}

	@ManyToOne
	public ContactMechanism getTakenVia() {
		return takenVia;
	}

	public void setBillTo(BillToCustomer billTo) {
		this.billTo = billTo;
	}

	public void setDesignatedToBeBilledTo(
			ContactMechanism designatedToBeBilledTo) {
		this.designatedToBeBilledTo = designatedToBeBilledTo;
	}

	public void setPlacedBy(PlacingCustomer placedBy) {
		this.placedBy = placedBy;
	}

	public void setPlacedUsingMechanism(ContactMechanism placedUsing) {
		this.placedUsingMechanism = placedUsing;
	}

	public void setTakenBy(InternalOrganization takenBy) {
		this.takenBy = takenBy;
	}

	public void setTakenVia(ContactMechanism takenVia) {
		this.takenVia = takenVia;
	}

	
}