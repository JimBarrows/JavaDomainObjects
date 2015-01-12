package jdo.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.PartyRole;
import jdo.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2015-01-11T23:53:12.666-0700")
@StaticMetamodel(SalesOrder.class)
public class SalesOrder_ extends Order_ {
	public static volatile SingularAttribute<SalesOrder, PartyRole> billTo;
	public static volatile SingularAttribute<SalesOrder, ContactMechanism> designatedToBeBilledTo;
	public static volatile SingularAttribute<SalesOrder, PartyRole> placedBy;
	public static volatile SingularAttribute<SalesOrder, ContactMechanism> placedUsingMechanism;
	public static volatile SingularAttribute<SalesOrder, PartyRole> takenBy;
	public static volatile SingularAttribute<SalesOrder, ContactMechanism> takenVia;
}
