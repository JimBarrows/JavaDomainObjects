package jdo.shipment.model.issuance;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;

import jdo.model.BasePersistentModel;
import jdo.product.model.storage.InventoryItem;
import jdo.shipment.model.ShipmentItem;

@Entity
public class ItemIssuance extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private PicklistItem issuedAccordingTo;

	@ManyToOne
	private ShipmentItem issuedFor;

	@ManyToOne
	private InventoryItem issuedFrom;

	@Temporal(TemporalType.DATE)
	private Date issuedOn;

	@Min(1)
	private int quantity;

	public PicklistItem getIssuedAccordingTo() {
		return issuedAccordingTo;
	}

	public ShipmentItem getIssuedFor() {
		return issuedFor;
	}

	public InventoryItem getIssuedFrom() {
		return issuedFrom;
	}

	public Date getIssuedOn() {
		return issuedOn;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setIssuedAccordingTo(PicklistItem issuedAccordingTo) {
		this.issuedAccordingTo = issuedAccordingTo;
	}

	public void setIssuedFor(ShipmentItem issuedFor) {
		this.issuedFor = issuedFor;
	}

	public void setIssuedFrom(InventoryItem issuedFrom) {
		this.issuedFrom = issuedFrom;
	}

	public void setIssuedOn(Date issuedOn) {
		this.issuedOn = issuedOn;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
