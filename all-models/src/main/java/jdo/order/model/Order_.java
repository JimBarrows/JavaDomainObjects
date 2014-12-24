package jdo.order.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.order.model.adjustment.OrderAdjustment;
import jdo.order.model.status.OrderStatus;
import jdo.order.model.terms.OrderTerm;

@Generated(value="Dali", date="2014-12-24T16:23:56.035-0700")
@StaticMetamodel(Order.class)
public class Order_ {
	public static volatile ListAttribute<Order, OrderAdjustment> affectedBy;
	public static volatile ListAttribute<Order, OrderItem> composedOf;
	public static volatile ListAttribute<Order, OrderContactMechanism> contactMechanisms;
	public static volatile SingularAttribute<Order, Date> entryDate;
	public static volatile ListAttribute<Order, OrderRole> involving;
	public static volatile SingularAttribute<Order, Date> orderDate;
	public static volatile ListAttribute<Order, OrderStatus> stateOf;
	public static volatile ListAttribute<Order, OrderTerm> subjectTo;
}
