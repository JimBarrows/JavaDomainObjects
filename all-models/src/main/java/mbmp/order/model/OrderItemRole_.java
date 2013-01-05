package mbmp.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-05T07:41:45.779-0700")
@StaticMetamodel(OrderItemRole.class)
public class OrderItemRole_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<OrderItemRole, Party> assignedTo;
	public static volatile SingularAttribute<OrderItemRole, OrderItemRoleType> type;
}
