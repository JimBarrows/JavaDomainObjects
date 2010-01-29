package com.nsfwenterprises.biz360.shipment.model.receipt;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.validator.Min;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.shipment.model.ShipmentItem;

@Entity
public class PackagingContent extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ShipmentItem item;
	
	private int quantity;

	@ManyToOne
	public ShipmentItem getItem() {
		return item;
	}

	@Min(1)
	public int getQuantity() {
		return quantity;
	}

	public void setItem(ShipmentItem item) {
		this.item = item;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
