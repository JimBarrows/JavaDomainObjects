package mbmp.shipment.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import mbmp.model.BasePersistentModel;
import mbmp.order.model.OrderItem;
@Entity
public class OrderShipment extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int quantity;
	
	private ShipmentItem shipmentOf;
	
	private OrderItem shippedVia;
	
	@Min(1)
	public int getQuantity() {
		return quantity;
	}
	@ManyToOne
	public ShipmentItem getShipmentOf() {
		return shipmentOf;
	}
	
	@ManyToOne
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
