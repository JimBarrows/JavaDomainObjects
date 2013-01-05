package mbmp.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.party.model.PartyRole;
import mbmp.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2013-01-04T22:11:20.564-0700")
@StaticMetamodel(SalesOrderItem.class)
public class SalesOrderItem_ extends OrderItem_ {
	public static volatile ListAttribute<SalesOrderItem, PurchaseOrderItem> associatedWith;
	public static volatile SingularAttribute<SalesOrderItem, ContactMechanism> shippedToMechanism;
	public static volatile SingularAttribute<SalesOrderItem, PartyRole> shipToCustomer;
}
