package jdo.shipment.model.receipt;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-02T21:45:38.700-0700")
@StaticMetamodel(ShipmentPackage.class)
public class ShipmentPackage_ extends BasePersistentModel_ {
	public static volatile ListAttribute<ShipmentPackage, PackagingContent> composedOf;
	public static volatile ListAttribute<ShipmentPackage, ShipmentReceipt> consistingOf;
}
