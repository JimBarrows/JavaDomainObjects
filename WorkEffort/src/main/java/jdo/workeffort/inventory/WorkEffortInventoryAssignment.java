package jdo.workeffort.inventory;

import java.util.UUID;

import javax.persistence.Entity;

import jdo.model.BasePersistentModel;

@Entity
public class WorkEffortInventoryAssignment extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int quantity;
	/**
	 * UUID of the InventoryItem.
	 * 
	 */
	private UUID useOf;

	public int getQuantity() {
		return quantity;
	}

	public UUID getUseOf() {
		return useOf;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setUseOf(UUID useOf) {
		this.useOf = useOf;
	}
}
