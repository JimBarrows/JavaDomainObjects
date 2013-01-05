package mbmp.shipment.model.route;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.PartyRole;
import mbmp.party.model.facility.Facility;
import mbmp.shipment.model.Shipment;

@Generated(value="Dali", date="2013-01-04T22:11:23.414-0700")
@StaticMetamodel(ShipmentRouteSegment.class)
public class ShipmentRouteSegment_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ShipmentRouteSegment, Date> actualArrival;
	public static volatile SingularAttribute<ShipmentRouteSegment, Date> actualStart;
	public static volatile SingularAttribute<ShipmentRouteSegment, Long> endMileage;
	public static volatile SingularAttribute<ShipmentRouteSegment, Date> estimatedArrival;
	public static volatile SingularAttribute<ShipmentRouteSegment, Date> estimatedStart;
	public static volatile SingularAttribute<ShipmentRouteSegment, BigDecimal> fuelUsed;
	public static volatile SingularAttribute<ShipmentRouteSegment, Shipment> shipmentOf;
	public static volatile SingularAttribute<ShipmentRouteSegment, Facility> shippedFrom;
	public static volatile SingularAttribute<ShipmentRouteSegment, Facility> shippedTo;
	public static volatile SingularAttribute<ShipmentRouteSegment, ShipmentMethodType> shippedVia;
	public static volatile SingularAttribute<ShipmentRouteSegment, PartyRole> shipppedBy;
	public static volatile SingularAttribute<ShipmentRouteSegment, Long> startMileage;
}
