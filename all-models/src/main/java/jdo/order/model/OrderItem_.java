package jdo.order.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.model.BasePersistentModel_;
import jdo.order.model.status.OrderStatus;
import jdo.order.model.terms.OrderTerm;
import jdo.product.model.Product;
import jdo.product.model.feature.ProductFeature;

@Generated(value="Dali", date="2014-12-02T21:59:11.566-0700")
@StaticMetamodel(OrderItem.class)
public class OrderItem_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderItem, Date> estimatedDeliveryDate;
	public static volatile SingularAttribute<OrderItem, ProductFeature> forFeature;
	public static volatile SingularAttribute<OrderItem, Product> forProduct;
	public static volatile ListAttribute<OrderItem, OrderItemContactMechanism> having;
	public static volatile ListAttribute<OrderItem, OrderItemRole> involving;
	public static volatile SingularAttribute<OrderItem, String> itemDescription;
	public static volatile SingularAttribute<OrderItem, OrderItem> orderedWith;
	public static volatile SingularAttribute<OrderItem, String> shippingInstructions;
	public static volatile ListAttribute<OrderItem, OrderStatus> stateOf;
	public static volatile ListAttribute<OrderItem, OrderTerm> subjectTo;
	public static volatile SingularAttribute<OrderItem, Money> unitPrice;
	public static volatile SingularAttribute<OrderItem, String> comment;
	public static volatile SingularAttribute<OrderItem, Long> orderItemSeqId;
	public static volatile SingularAttribute<OrderItem, Integer> quantity;
}
