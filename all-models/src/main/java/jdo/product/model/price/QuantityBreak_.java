package jdo.product.model.price;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-24T16:23:57.402-0700")
@StaticMetamodel(QuantityBreak.class)
public class QuantityBreak_ {
	public static volatile ListAttribute<QuantityBreak, PriceComponent> discountLevelDefinedFor;
	public static volatile SingularAttribute<QuantityBreak, Integer> fromQuantity;
	public static volatile SingularAttribute<QuantityBreak, Integer> thruQuantity;
}
