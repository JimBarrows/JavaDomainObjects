package jdo.order.model.terms;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.order.model.Order;
import jdo.order.model.OrderItem;

@Generated(value="Dali", date="2014-12-24T16:23:56.134-0700")
@StaticMetamodel(OrderTerm.class)
public class OrderTerm_ {
	public static volatile SingularAttribute<OrderTerm, OrderItem> conditionForItem;
	public static volatile SingularAttribute<OrderTerm, Order> conditionForOrder;
	public static volatile SingularAttribute<OrderTerm, OrderTermType> describedBy;
	public static volatile SingularAttribute<OrderTerm, Money> value;
}
