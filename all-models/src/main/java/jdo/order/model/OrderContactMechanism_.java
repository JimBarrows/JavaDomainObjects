package jdo.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.contactmechanism.ContactMechanism;
import jdo.party.model.contactmechanism.ContactMechanismPurposeType;

@Generated(value="Dali", date="2014-12-24T16:23:56.052-0700")
@StaticMetamodel(OrderContactMechanism.class)
public class OrderContactMechanism_ {
	public static volatile SingularAttribute<OrderContactMechanism, ContactMechanism> contactMechanism;
	public static volatile SingularAttribute<OrderContactMechanism, ContactMechanismPurposeType> usedFor;
}
