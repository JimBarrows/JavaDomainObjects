package mbmp.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.contactmechanism.ContactMechanism;
import mbmp.party.model.contactmechanism.ContactMechanismPurposeType;

@Generated(value="Dali", date="2013-01-04T22:11:20.538-0700")
@StaticMetamodel(OrderContactMechanism.class)
public class OrderContactMechanism_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderContactMechanism, ContactMechanism> contactMechanism;
	public static volatile SingularAttribute<OrderContactMechanism, ContactMechanismPurposeType> usedFor;
}
