package jdo.shipment.model.receipt;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.model.BasePersistentModel_;
import jdo.shipment.model.ShipmentItem;

@Generated(value = "Dali", date = "2014-12-02T21:35:29.551-0700")
@StaticMetamodel(PackagingContent.class)
public class PackagingContent_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PackagingContent, ShipmentItem>	item;
	public static volatile SingularAttribute<PackagingContent, Integer>			quantity;
}
