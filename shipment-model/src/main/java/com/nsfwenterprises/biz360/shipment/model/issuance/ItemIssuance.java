package com.nsfwenterprises.biz360.shipment.model.issuance;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.Min;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.product.model.storage.InventoryItem;
import com.nsfwenterprises.biz360.shipment.model.ShipmentItem;

@Entity
public class ItemIssuance extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PicklistItem issuedAccordingTo;
	
	private ShipmentItem issuedFor;
	
	private InventoryItem issuedFrom;
	
	private Date issuedOn;
	
	private int quantity;

	@ManyToOne
	public PicklistItem getIssuedAccordingTo() {
		return issuedAccordingTo;
	}

	@ManyToOne
	public ShipmentItem getIssuedFor() {
		return issuedFor;
	}

	@ManyToOne
	public InventoryItem getIssuedFrom() {
		return issuedFrom;
	}

	@Temporal(TemporalType.DATE)
	public Date getIssuedOn() {
		return issuedOn;
	}

	@Min(1)
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
