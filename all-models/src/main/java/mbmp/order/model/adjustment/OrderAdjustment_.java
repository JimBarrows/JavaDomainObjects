package mbmp.order.model.adjustment;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.order.model.Order;
import mbmp.order.model.OrderItem;

@Generated(value="Dali", date="2013-01-04T22:11:20.531-0700")
@StaticMetamodel(OrderAdjustment.class)
public class OrderAdjustment_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderAdjustment, OrderItem> affectingItem;
	public static volatile SingularAttribute<OrderAdjustment, Order> affectingOrder;
	public static volatile SingularAttribute<OrderAdjustment, BigDecimal> amount;
	public static volatile SingularAttribute<OrderAdjustment, Integer> percentage;
	public static volatile SingularAttribute<OrderAdjustment, OrderAdjustmentType> type;
}
