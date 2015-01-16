package jdo.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.contactmechanism.ContactMechanism;
import jdo.party.model.contactmechanism.ContactMechanismPurposeType;

@Generated(value="Dali", date="2015-01-15T23:09:53.705-0700")
@StaticMetamodel(OrderContactMechanism.class)
public class OrderContactMechanism_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderContactMechanism, Order> order;
	public static volatile SingularAttribute<OrderContactMechanism, ContactMechanism> contactMechanism;
	public static volatile SingularAttribute<OrderContactMechanism, ContactMechanismPurposeType> usedFor;
}
