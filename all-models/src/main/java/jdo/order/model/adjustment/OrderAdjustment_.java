package jdo.order.model.adjustment;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.order.model.Order;
import jdo.order.model.OrderItem;

@Generated(value="Dali", date="2014-11-07T22:13:42.652-0700")
@StaticMetamodel(OrderAdjustment.class)
public class OrderAdjustment_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderAdjustment, OrderItem> affectingItem;
	public static volatile SingularAttribute<OrderAdjustment, Order> affectingOrder;
	public static volatile SingularAttribute<OrderAdjustment, BigDecimal> amount;
	public static volatile SingularAttribute<OrderAdjustment, Integer> percentage;
	public static volatile SingularAttribute<OrderAdjustment, OrderAdjustmentType> type;
}
