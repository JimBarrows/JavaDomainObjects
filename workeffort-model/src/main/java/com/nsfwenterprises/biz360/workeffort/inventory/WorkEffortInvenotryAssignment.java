package com.nsfwenterprises.biz360.workeffort.inventory;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.product.model.storage.InventoryItem;

@Entity
public class WorkEffortInvenotryAssignment extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int quantity;
	
	private InventoryItem useOf;

	public int getQuantity() {
		return quantity;
	}

	@ManyToOne
	public InventoryItem getUseOf() {
		return useOf;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setUseOf(InventoryItem useOf) {
		this.useOf = useOf;
	}
}
