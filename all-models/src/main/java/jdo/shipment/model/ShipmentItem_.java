package jdo.shipment.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.product.model.Good;
import jdo.product.model.feature.ProductFeature;

@Generated(value="Dali", date="2015-01-12T07:22:59.554-0700")
@StaticMetamodel(ShipmentItem.class)
public class ShipmentItem_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ShipmentItem, String> contentsDescription;
	public static volatile SingularAttribute<ShipmentItem, Integer> quantity;
	public static volatile SingularAttribute<ShipmentItem, Integer> sequenceNumber;
	public static volatile ListAttribute<ShipmentItem, ShipmentItem> shipmentItems;
	public static volatile SingularAttribute<ShipmentItem, Good> shipmentOf;
	public static volatile ListAttribute<ShipmentItem, OrderShipment> shipmentsOf;
	public static volatile ListAttribute<ShipmentItem, ProductFeature> shippedWith;
}
