package jdo.product.model.storage;

import javax.validation.constraints.Min;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:31 AM
 */
public class NonSerializedInventoryItem extends InventoryItem {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Min(value = 0)
	private long				quantityOnHand;

	public long getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(long quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

}