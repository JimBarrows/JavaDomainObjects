package jdo.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.PartyRole;
import jdo.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2014-12-02T21:45:37.823-0700")
@StaticMetamodel(SalesOrderItem.class)
public class SalesOrderItem_ extends OrderItem_ {
	public static volatile ListAttribute<SalesOrderItem, PurchaseOrderItem> associatedWith;
	public static volatile SingularAttribute<SalesOrderItem, ContactMechanism> shippedToMechanism;
	public static volatile SingularAttribute<SalesOrderItem, PartyRole> shipToCustomer;
}
