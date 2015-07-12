package jdo.shipment.model.receipt;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import jdo.model.BasePersistentModel;
import jdo.shipment.model.ShipmentItem;

@Entity
public class PackagingContent extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	@ManyToOne
	private ShipmentItem		item;
	@Min(1)
	private int					quantity;

	
	public ShipmentItem getItem() {
		return item;
	}

	
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
