package jdo.order.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.order.model.adjustment.OrderAdjustment;
import jdo.order.model.status.OrderStatus;
import jdo.order.model.terms.OrderTerm;

@Generated(value="Dali", date="2014-11-07T22:13:42.666-0700")
@StaticMetamodel(Order.class)
public class Order_ extends BasePersistentModel_ {
	public static volatile ListAttribute<Order, OrderAdjustment> affectedBy;
	public static volatile ListAttribute<Order, OrderItem> composedOf;
	public static volatile ListAttribute<Order, OrderContactMechanism> contactMechanisms;
	public static volatile SingularAttribute<Order, Date> entryDate;
	public static volatile ListAttribute<Order, OrderRole> involving;
	public static volatile SingularAttribute<Order, Date> orderDate;
	public static volatile ListAttribute<Order, OrderStatus> stateOf;
	public static volatile ListAttribute<Order, OrderTerm> subjectTo;
}
