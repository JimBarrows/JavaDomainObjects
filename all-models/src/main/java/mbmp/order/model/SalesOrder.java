package mbmp.order.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import mbmp.party.model.PartyRole;
import mbmp.party.model.contactmechanism.ContactMechanism;

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

	private PartyRole billTo;

	private ContactMechanism designatedToBeBilledTo;

	private PartyRole placedBy;

	private ContactMechanism placedUsingMechanism;

	private PartyRole takenBy;

	private ContactMechanism takenVia;

	@ManyToOne
	public PartyRole getBillTo() {
		return billTo;
	}

	@ManyToOne
	public ContactMechanism getDesignatedToBeBilledTo() {
		return designatedToBeBilledTo;
	}

	@ManyToOne
	public PartyRole getPlacedBy() {
		return placedBy;
	}

	@ManyToOne
	public ContactMechanism getPlacedUsingMechanism() {
		return placedUsingMechanism;
	}

	@ManyToOne
	public PartyRole getTakenBy() {
		return takenBy;
	}

	@ManyToOne
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