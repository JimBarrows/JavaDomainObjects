package mbmp.order.model.status;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.order.model.Order;
import mbmp.order.model.OrderItem;

@Generated(value="Dali", date="2013-01-04T22:11:20.566-0700")
@StaticMetamodel(OrderStatus.class)
public class OrderStatus_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderStatus, OrderStatusType> describedBy;
	public static volatile SingularAttribute<OrderStatus, OrderItem> statusForItem;
	public static volatile SingularAttribute<OrderStatus, Order> statusForOrder;
	public static volatile SingularAttribute<OrderStatus, Date> statusOn;
}
