package jdo.workeffort.model.inventory;

import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class WorkEffortInventoryAssignment extends PersistentEntity {

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
