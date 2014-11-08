package mbmp.shipment.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.product.model.Good;
import mbmp.product.model.feature.ProductFeature;

@Generated(value="Dali", date="2014-11-07T06:11:39.803-0700")
@StaticMetamodel(ShipmentItem.class)
public class ShipmentItem_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ShipmentItem, String> contentsDescription;
	public static volatile ListAttribute<ShipmentItem, ShipmentItem> shipmentItems;
	public static volatile SingularAttribute<ShipmentItem, Good> shipmentOf;
	public static volatile ListAttribute<ShipmentItem, OrderShipment> shipmentsOf;
	public static volatile ListAttribute<ShipmentItem, ProductFeature> shippedWith;
	public static volatile SingularAttribute<ShipmentItem, Integer> quantity;
	public static volatile SingularAttribute<ShipmentItem, Integer> sequenceNumber;
}
