package jdo.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-11-07T22:13:42.701-0700")
@StaticMetamodel(OrderItemRole.class)
public class OrderItemRole_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<OrderItemRole, Party> assignedTo;
	public static volatile SingularAttribute<OrderItemRole, OrderItemRoleType> type;
}
