package jdo.shipment.model.route;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.asset.Vehicle;
import jdo.fields.Money;
import jdo.model.BasePersistentModel_;
import jdo.party.model.PartyRole;
import jdo.party.model.facility.Facility;
import jdo.shipment.model.Shipment;

@Generated(value="Dali", date="2015-01-12T15:57:17.142-0700")
@StaticMetamodel(ShipmentRouteSegment.class)
public class ShipmentRouteSegment_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ShipmentRouteSegment, Date> actualArrival;
	public static volatile SingularAttribute<ShipmentRouteSegment, Date> actualStart;
	public static volatile SingularAttribute<ShipmentRouteSegment, Long> endMileage;
	public static volatile SingularAttribute<ShipmentRouteSegment, Date> estimatedArrival;
	public static volatile SingularAttribute<ShipmentRouteSegment, Date> estimatedStart;
	public static volatile SingularAttribute<ShipmentRouteSegment, Money> fuelUsed;
	public static volatile SingularAttribute<ShipmentRouteSegment, Shipment> shipmentOf;
	public static volatile SingularAttribute<ShipmentRouteSegment, Facility> shippedFrom;
	public static volatile SingularAttribute<ShipmentRouteSegment, Facility> shippedTo;
	public static volatile SingularAttribute<ShipmentRouteSegment, Vehicle> vehicle;
	public static volatile SingularAttribute<ShipmentRouteSegment, ShipmentMethodType> shippedVia;
	public static volatile SingularAttribute<ShipmentRouteSegment, PartyRole> shipppedBy;
	public static volatile SingularAttribute<ShipmentRouteSegment, Long> startMileage;
}
