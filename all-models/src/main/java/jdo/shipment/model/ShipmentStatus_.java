package jdo.shipment.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-24T16:23:57.787-0700")
@StaticMetamodel(ShipmentStatus.class)
public class ShipmentStatus_ {
	public static volatile SingularAttribute<ShipmentStatus, Date> statusDate;
	public static volatile SingularAttribute<ShipmentStatus, ShipmentStatusType> type;
}
