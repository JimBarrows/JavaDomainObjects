package jdo.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.model.BasePersistentModel_;
import jdo.party.model.contactmechanism.ContactMechanism;
import jdo.party.model.contactmechanism.ContactMechanismPurposeType;

@Generated(value = "Dali", date = "2014-12-02T21:35:29.056-0700")
@StaticMetamodel(OrderItemContactMechanism.class)
public class OrderItemContactMechanism_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderItemContactMechanism, ContactMechanism>				mechanism;
	public static volatile SingularAttribute<OrderItemContactMechanism, ContactMechanismPurposeType>	type;
}
