package jdo.order.model.status;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.order.model.Order;
import jdo.order.model.OrderItem;

@Generated(value="Dali", date="2014-12-24T16:23:56.120-0700")
@StaticMetamodel(OrderStatus.class)
public class OrderStatus_ {
	public static volatile SingularAttribute<OrderStatus, OrderStatusType> describedBy;
	public static volatile SingularAttribute<OrderStatus, OrderItem> statusForItem;
	public static volatile SingularAttribute<OrderStatus, Order> statusForOrder;
	public static volatile SingularAttribute<OrderStatus, Date> statusOn;
}
