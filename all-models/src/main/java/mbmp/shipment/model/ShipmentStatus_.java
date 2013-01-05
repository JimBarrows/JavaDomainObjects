package mbmp.shipment.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:23.432-0700")
@StaticMetamodel(ShipmentStatus.class)
public class ShipmentStatus_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ShipmentStatus, Date> statusDate;
	public static volatile SingularAttribute<ShipmentStatus, ShipmentStatusType> type;
}
