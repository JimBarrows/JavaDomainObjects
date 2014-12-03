package jdo.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-02T21:59:11.577-0700")
@StaticMetamodel(OrderItemRole.class)
public class OrderItemRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderItemRole, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<OrderItemRole, Party> assignedTo;
	public static volatile SingularAttribute<OrderItemRole, OrderItemRoleType> type;
}
