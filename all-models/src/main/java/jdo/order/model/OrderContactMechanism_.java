package jdo.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.contactmechanism.ContactMechanism;
import jdo.party.model.contactmechanism.ContactMechanismPurposeType;

@Generated(value="Dali", date="2014-12-02T21:45:37.772-0700")
@StaticMetamodel(OrderContactMechanism.class)
public class OrderContactMechanism_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderContactMechanism, ContactMechanism> contactMechanism;
	public static volatile SingularAttribute<OrderContactMechanism, ContactMechanismPurposeType> usedFor;
}
