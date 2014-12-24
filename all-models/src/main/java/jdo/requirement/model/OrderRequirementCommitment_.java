package jdo.requirement.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.order.model.OrderItem;

@Generated(value="Dali", date="2014-12-24T16:23:57.622-0700")
@StaticMetamodel(OrderRequirementCommitment.class)
public class OrderRequirementCommitment_ {
	public static volatile SingularAttribute<OrderRequirementCommitment, OrderItem> usageOf;
	public static volatile SingularAttribute<OrderRequirementCommitment, Integer> quantity;
}
