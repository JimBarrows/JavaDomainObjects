package mbmp.order.model.terms;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.order.model.Order;
import mbmp.order.model.OrderItem;

@Generated(value="Dali", date="2013-01-04T22:11:20.570-0700")
@StaticMetamodel(OrderTerm.class)
public class OrderTerm_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderTerm, OrderItem> conditionForItem;
	public static volatile SingularAttribute<OrderTerm, Order> conditionForOrder;
	public static volatile SingularAttribute<OrderTerm, OrderTermType> describedBy;
	public static volatile SingularAttribute<OrderTerm, BigDecimal> value;
}
