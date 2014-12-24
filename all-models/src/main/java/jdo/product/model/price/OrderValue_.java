package jdo.product.model.price;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.fields.Money;

@Generated(value="Dali", date="2014-12-24T16:23:57.389-0700")
@StaticMetamodel(OrderValue.class)
public class OrderValue_ {
	public static volatile ListAttribute<OrderValue, PriceComponent> discountLevelDefinedFor;
	public static volatile SingularAttribute<OrderValue, Money> fromAmount;
	public static volatile SingularAttribute<OrderValue, Money> thruAmount;
}
