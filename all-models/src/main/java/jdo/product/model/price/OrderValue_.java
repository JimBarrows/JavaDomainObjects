package jdo.product.model.price;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T22:13:43.177-0700")
@StaticMetamodel(OrderValue.class)
public class OrderValue_ extends BasePersistentModel_ {
	public static volatile ListAttribute<OrderValue, PriceComponent> discountLevelDefinedFor;
	public static volatile SingularAttribute<OrderValue, BigDecimal> fromAmount;
	public static volatile SingularAttribute<OrderValue, BigDecimal> thruAmount;
}
