package mbmp.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.party.model.PartyRole;
import mbmp.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2013-01-04T22:11:20.559-0700")
@StaticMetamodel(PurchaseOrderItem.class)
public class PurchaseOrderItem_ extends OrderItem_ {
	public static volatile SingularAttribute<PurchaseOrderItem, PartyRole> designatedShipTo;
	public static volatile SingularAttribute<PurchaseOrderItem, ContactMechanism> shipToMechanism;
	public static volatile ListAttribute<PurchaseOrderItem, SalesOrderItem> usedToFillfill;
}
