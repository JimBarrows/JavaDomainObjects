package jdo.order.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2015-01-11T23:50:07.618-0700")
@StaticMetamodel(OrderRole.class)
public class OrderRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<OrderRole, Party> involving;
	public static volatile SingularAttribute<OrderRole, Order> partOf;
	public static volatile SingularAttribute<OrderRole, OrderRoleType> type;
}
