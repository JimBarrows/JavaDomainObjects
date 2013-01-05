package mbmp.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.party.model.PartyRole;
import mbmp.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2013-01-04T22:11:20.557-0700")
@StaticMetamodel(PurchaseOrder.class)
public class PurchaseOrder_ extends Order_ {
	public static volatile SingularAttribute<PurchaseOrder, ContactMechanism> billedTo;
	public static volatile SingularAttribute<PurchaseOrder, PartyRole> placedBy;
	public static volatile SingularAttribute<PurchaseOrder, ContactMechanism> placedUsing;
	public static volatile SingularAttribute<PurchaseOrder, PartyRole> requestedBillTo;
	public static volatile SingularAttribute<PurchaseOrder, PartyRole> takenBy;
	public static volatile SingularAttribute<PurchaseOrder, ContactMechanism> takenVia;
}
