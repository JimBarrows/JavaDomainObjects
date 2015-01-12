package jdo.product.model.price;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2015-01-11T23:55:25.544-0700")
@StaticMetamodel(OrderValue.class)
public class OrderValue_ extends BasePersistentModel_ {
	public static volatile ListAttribute<OrderValue, PriceComponent> discountLevelDefinedFor;
	public static volatile SingularAttribute<OrderValue, Money> fromAmount;
	public static volatile SingularAttribute<OrderValue, Money> thruAmount;
}
