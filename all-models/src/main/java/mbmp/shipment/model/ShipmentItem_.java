package mbmp.shipment.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.product.model.Good;
import mbmp.product.model.feature.ProductFeature;

@Generated(value="Dali", date="2013-01-04T22:11:23.430-0700")
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
