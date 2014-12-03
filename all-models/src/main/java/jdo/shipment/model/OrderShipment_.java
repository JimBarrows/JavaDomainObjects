package jdo.shipment.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.order.model.OrderItem;

@Generated(value="Dali", date="2014-12-02T21:45:38.660-0700")
@StaticMetamodel(OrderShipment.class)
public class OrderShipment_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderShipment, ShipmentItem> shipmentOf;
	public static volatile SingularAttribute<OrderShipment, OrderItem> shippedVia;
	public static volatile SingularAttribute<OrderShipment, Integer> quantity;
}
