package jdo.order.model.status;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.order.model.Order;
import jdo.order.model.OrderItem;

@Generated(value="Dali", date="2014-12-02T21:45:37.828-0700")
@StaticMetamodel(OrderStatus.class)
public class OrderStatus_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderStatus, OrderStatusType> describedBy;
	public static volatile SingularAttribute<OrderStatus, OrderItem> statusForItem;
	public static volatile SingularAttribute<OrderStatus, Order> statusForOrder;
	public static volatile SingularAttribute<OrderStatus, Date> statusOn;
}
