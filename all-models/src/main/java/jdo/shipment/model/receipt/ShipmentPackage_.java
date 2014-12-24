package jdo.shipment.model.receipt;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-24T16:23:57.732-0700")
@StaticMetamodel(ShipmentPackage.class)
public class ShipmentPackage_ {
	public static volatile ListAttribute<ShipmentPackage, PackagingContent> composedOf;
	public static volatile ListAttribute<ShipmentPackage, ShipmentReceipt> consistingOf;
}
