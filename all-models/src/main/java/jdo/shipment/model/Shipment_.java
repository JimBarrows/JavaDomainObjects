package jdo.shipment.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;
import jdo.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2014-11-07T22:13:43.607-0700")
@StaticMetamodel(Shipment.class)
public class Shipment_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Shipment, Date> estimatedArrivalDate;
	public static volatile SingularAttribute<Shipment, Date> estimatedReadyDate;
	public static volatile SingularAttribute<Shipment, Date> estimatedShipDate;
	public static volatile SingularAttribute<Shipment, String> handlingInstructions;
	public static volatile SingularAttribute<Shipment, ContactMechanism> inquiredAboutVia;
	public static volatile ListAttribute<Shipment, ShipmentItem> items;
	public static volatile SingularAttribute<Shipment, Date> lastUpdated;
	public static volatile SingularAttribute<Shipment, Date> latestCancelDate;
	public static volatile SingularAttribute<Shipment, ContactMechanism> shippedFromContactMechanism;
	public static volatile SingularAttribute<Shipment, Party> shippedFromParty;
	public static volatile SingularAttribute<Shipment, ContactMechanism> shippedToContactMechanism;
	public static volatile SingularAttribute<Shipment, Party> shippedToParty;
	public static volatile ListAttribute<Shipment, ShipmentStatus> statuses;
	public static volatile SingularAttribute<Shipment, BigDecimal> actualShipCost;
	public static volatile SingularAttribute<Shipment, BigDecimal> estimatedShipCost;
}