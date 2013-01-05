package mbmp.shipment.model.receipt;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-05T08:07:18.012-0700")
@StaticMetamodel(ShipmentPackage.class)
public class ShipmentPackage_ extends BasePersistentModel_ {
	public static volatile ListAttribute<ShipmentPackage, PackagingContent> composedOf;
	public static volatile ListAttribute<ShipmentPackage, ShipmentReceipt> consistingOf;
}
