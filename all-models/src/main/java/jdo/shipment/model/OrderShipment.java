package jdo.shipment.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import jdo.model.BasePersistentModel;
import jdo.order.model.OrderItem;

@Entity
public class OrderShipment extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	@Min(1)
	private int					quantity;
	@ManyToOne
	private ShipmentItem		shipmentOf;
	@ManyToOne
	private OrderItem			shippedVia;

	
	public int getQuantity() {
		return quantity;
	}

	
	public ShipmentItem getShipmentOf() {
		return shipmentOf;
	}

	
	public OrderItem getShippedVia() {
		return shippedVia;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setShipmentOf(ShipmentItem shipmentOf) {
		this.shipmentOf = shipmentOf;
	}

	public void setShippedVia(OrderItem shippedVia) {
		this.shippedVia = shippedVia;
	}
}
