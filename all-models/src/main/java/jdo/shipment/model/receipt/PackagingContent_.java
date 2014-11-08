package jdo.shipment.model.receipt;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.shipment.model.ShipmentItem;

@Generated(value="Dali", date="2014-11-07T22:13:43.566-0700")
@StaticMetamodel(PackagingContent.class)
public class PackagingContent_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PackagingContent, ShipmentItem> item;
	public static volatile SingularAttribute<PackagingContent, Integer> quantity;
}
