package mbmp.requirement.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.order.model.OrderItem;

@Generated(value="Dali", date="2013-01-04T22:11:23.126-0700")
@StaticMetamodel(OrderRequirementCommitment.class)
public class OrderRequirementCommitment_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderRequirementCommitment, Integer> quantity;
	public static volatile SingularAttribute<OrderRequirementCommitment, OrderItem> usageOf;
}
