package mbmp.invoice.model.billing;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.invoice.model.InvoiceItem;
import mbmp.model.BasePersistentModel_;
import mbmp.order.model.OrderItem;

@Generated(value="Dali", date="2014-11-07T06:11:39.418-0700")
@StaticMetamodel(OrderItemBilling.class)
public class OrderItemBilling_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderItemBilling, InvoiceItem> billingFor;
	public static volatile SingularAttribute<OrderItemBilling, OrderItem> quantityOf;
	public static volatile SingularAttribute<OrderItemBilling, BigDecimal> amount;
	public static volatile SingularAttribute<OrderItemBilling, Integer> quantity;
}
