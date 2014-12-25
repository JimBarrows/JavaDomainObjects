package jdo.shipment.model.receipt;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-24T17:30:48.748-0700")
@StaticMetamodel(ShipmentPackage.class)
public class ShipmentPackage_ extends BasePersistentModel_ {
	public static volatile ListAttribute<ShipmentPackage, PackagingContent> composedOf;
	public static volatile ListAttribute<ShipmentPackage, ShipmentReceipt> consistingOf;
}
