package jdo.product.model.price;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T22:13:43.190-0700")
@StaticMetamodel(QuantityBreak.class)
public class QuantityBreak_ extends BasePersistentModel_ {
	public static volatile ListAttribute<QuantityBreak, PriceComponent> discountLevelDefinedFor;
	public static volatile SingularAttribute<QuantityBreak, Integer> fromQuantity;
	public static volatile SingularAttribute<QuantityBreak, Integer> thruQuantity;
}