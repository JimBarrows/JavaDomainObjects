package mbmp.shipment.model.receipt;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.shipment.model.ShipmentItem;

@Generated(value="Dali", date="2013-01-05T08:07:17.966-0700")
@StaticMetamodel(PackagingContent.class)
public class PackagingContent_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PackagingContent, ShipmentItem> item;
	public static volatile SingularAttribute<PackagingContent, Integer> quantity;
}
