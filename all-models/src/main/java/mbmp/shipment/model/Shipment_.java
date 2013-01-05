package mbmp.shipment.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Party;
import mbmp.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2013-01-04T22:11:23.422-0700")
@StaticMetamodel(Shipment.class)
public class Shipment_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Shipment, BigDecimal> actualShipCost;
	public static volatile SingularAttribute<Shipment, Date> estimatedArrivalDate;
	public static volatile SingularAttribute<Shipment, Date> estimatedReadyDate;
	public static volatile SingularAttribute<Shipment, BigDecimal> estimatedShipCost;
	public static volatile SingularAttribute<Shipment, Date> estimatedShipDate;
	public static volatile SingularAttribute<Shipment, String> handlingInstructions;
	public static volatile SingularAttribute<Shipment, ContactMechanism> inquiredAboutVia;
	public static volatile ListAttribute<Shipment, ShipmentItem> items;
	public static volatile SingularAttribute<Shipment, Date> lastUpdated;
	public static volatile SingularAttribute<Shipment, Date> latestCancelDate;
	public static volatile SingularAttribute<Shipment, Party> shippedFromParty;
	public static volatile SingularAttribute<Shipment, Party> shippedToParty;
	public static volatile ListAttribute<Shipment, ShipmentStatus> statuses;
}
