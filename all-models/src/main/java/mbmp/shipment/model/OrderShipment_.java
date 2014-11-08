package mbmp.shipment.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.order.model.OrderItem;

@Generated(value="Dali", date="2014-11-07T06:11:39.745-0700")
@StaticMetamodel(OrderShipment.class)
public class OrderShipment_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderShipment, ShipmentItem> shipmentOf;
	public static volatile SingularAttribute<OrderShipment, OrderItem> shippedVia;
	public static volatile SingularAttribute<OrderShipment, Integer> quantity;
}
