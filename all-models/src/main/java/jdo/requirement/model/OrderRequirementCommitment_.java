package jdo.requirement.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.order.model.OrderItem;

@Generated(value="Dali", date="2015-01-12T07:14:53.834-0700")
@StaticMetamodel(OrderRequirementCommitment.class)
public class OrderRequirementCommitment_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderRequirementCommitment, Integer> quantity;
	public static volatile SingularAttribute<OrderRequirementCommitment, OrderItem> usageOf;
}
