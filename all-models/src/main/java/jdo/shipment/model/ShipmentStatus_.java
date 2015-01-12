package jdo.shipment.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2015-01-12T07:23:20.666-0700")
@StaticMetamodel(ShipmentStatus.class)
public class ShipmentStatus_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ShipmentStatus, Date> statusDate;
	public static volatile SingularAttribute<ShipmentStatus, ShipmentStatusType> type;
}
