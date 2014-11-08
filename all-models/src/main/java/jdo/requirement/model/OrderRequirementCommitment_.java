package jdo.requirement.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.order.model.OrderItem;

@Generated(value="Dali", date="2014-11-07T22:13:43.473-0700")
@StaticMetamodel(OrderRequirementCommitment.class)
public class OrderRequirementCommitment_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderRequirementCommitment, OrderItem> usageOf;
	public static volatile SingularAttribute<OrderRequirementCommitment, Integer> quantity;
}
