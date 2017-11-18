package jdo.shipment.model.receipt;

import jdo.model.PersistentEntity;
import jdo.shipment.model.ShipmentItem;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

@Entity
public class PackagingContent extends PersistentEntity {

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
