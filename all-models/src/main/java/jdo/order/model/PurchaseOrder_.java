package jdo.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.party.model.PartyRole;
import jdo.party.model.contactmechanism.ContactMechanism;

@Generated(value = "Dali", date = "2014-12-02T21:35:29.079-0700")
@StaticMetamodel(PurchaseOrder.class)
public class PurchaseOrder_ extends Order_ {
	public static volatile SingularAttribute<PurchaseOrder, ContactMechanism>	billedTo;
	public static volatile SingularAttribute<PurchaseOrder, PartyRole>			placedBy;
	public static volatile SingularAttribute<PurchaseOrder, ContactMechanism>	placedUsing;
	public static volatile SingularAttribute<PurchaseOrder, PartyRole>			requestedBillTo;
	public static volatile SingularAttribute<PurchaseOrder, PartyRole>			takenBy;
	public static volatile SingularAttribute<PurchaseOrder, ContactMechanism>	takenVia;
}
