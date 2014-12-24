package jdo.order.model.adjustment;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.order.model.Order;
import jdo.order.model.OrderItem;

@Generated(value="Dali", date="2014-12-24T16:23:55.914-0700")
@StaticMetamodel(OrderAdjustment.class)
public class OrderAdjustment_ {
	public static volatile SingularAttribute<OrderAdjustment, OrderItem> affectingItem;
	public static volatile SingularAttribute<OrderAdjustment, Order> affectingOrder;
	public static volatile SingularAttribute<OrderAdjustment, Money> amount;
	public static volatile SingularAttribute<OrderAdjustment, Integer> percentage;
	public static volatile SingularAttribute<OrderAdjustment, OrderAdjustmentType> type;
}
