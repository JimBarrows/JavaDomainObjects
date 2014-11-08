package jdo.order.model.terms;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.order.model.Order;
import jdo.order.model.OrderItem;

@Generated(value="Dali", date="2014-11-07T22:13:42.763-0700")
@StaticMetamodel(OrderTerm.class)
public class OrderTerm_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderTerm, OrderItem> conditionForItem;
	public static volatile SingularAttribute<OrderTerm, Order> conditionForOrder;
	public static volatile SingularAttribute<OrderTerm, OrderTermType> describedBy;
	public static volatile SingularAttribute<OrderTerm, BigDecimal> value;
}
