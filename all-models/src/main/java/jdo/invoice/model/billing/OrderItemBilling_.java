package jdo.invoice.model.billing;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.invoice.model.InvoiceItem;
import jdo.model.BasePersistentModel_;
import jdo.order.model.OrderItem;

@Generated(value="Dali", date="2014-11-07T22:13:42.516-0700")
@StaticMetamodel(OrderItemBilling.class)
public class OrderItemBilling_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderItemBilling, InvoiceItem> billingFor;
	public static volatile SingularAttribute<OrderItemBilling, OrderItem> quantityOf;
	public static volatile SingularAttribute<OrderItemBilling, BigDecimal> amount;
	public static volatile SingularAttribute<OrderItemBilling, Integer> quantity;
}
