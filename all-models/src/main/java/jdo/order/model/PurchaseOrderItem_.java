package jdo.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.PartyRole;
import jdo.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2014-11-07T22:13:42.735-0700")
@StaticMetamodel(PurchaseOrderItem.class)
public class PurchaseOrderItem_ extends OrderItem_ {
	public static volatile SingularAttribute<PurchaseOrderItem, PartyRole> designatedShipTo;
	public static volatile SingularAttribute<PurchaseOrderItem, ContactMechanism> shipToMechanism;
	public static volatile ListAttribute<PurchaseOrderItem, SalesOrderItem> usedToFillfill;
}
