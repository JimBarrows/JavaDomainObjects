package mbmp.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-04T22:11:20.549-0700")
@StaticMetamodel(OrderRole.class)
public class OrderRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderRole, Party> involving;
	public static volatile SingularAttribute<OrderRole, Order> partOf;
	public static volatile SingularAttribute<OrderRole, OrderRoleType> type;
}
