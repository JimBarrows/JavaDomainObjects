package jdo.shipment.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.order.model.OrderItem;

@Generated(value="Dali", date="2014-12-24T16:23:57.710-0700")
@StaticMetamodel(OrderShipment.class)
public class OrderShipment_ {
	public static volatile SingularAttribute<OrderShipment, ShipmentItem> shipmentOf;
	public static volatile SingularAttribute<OrderShipment, OrderItem> shippedVia;
	public static volatile SingularAttribute<OrderShipment, Integer> quantity;
}
