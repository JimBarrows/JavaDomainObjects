package mbmp.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.party.model.PartyRole;
import mbmp.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2013-01-04T22:11:20.562-0700")
@StaticMetamodel(SalesOrder.class)
public class SalesOrder_ extends Order_ {
	public static volatile SingularAttribute<SalesOrder, PartyRole> billTo;
	public static volatile SingularAttribute<SalesOrder, ContactMechanism> designatedToBeBilledTo;
	public static volatile SingularAttribute<SalesOrder, PartyRole> placedBy;
	public static volatile SingularAttribute<SalesOrder, ContactMechanism> placedUsingMechanism;
	public static volatile SingularAttribute<SalesOrder, PartyRole> takenBy;
	public static volatile SingularAttribute<SalesOrder, ContactMechanism> takenVia;
}
