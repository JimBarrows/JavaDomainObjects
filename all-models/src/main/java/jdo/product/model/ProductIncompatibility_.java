package jdo.product.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2014-11-07T22:13:43.236-0700")
@StaticMetamodel(ProductIncompatibility.class)
public class ProductIncompatibility_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<ProductIncompatibility, Product> aUseOf;
	public static volatile SingularAttribute<ProductIncompatibility, Product> productFor;
	public static volatile SingularAttribute<ProductIncompatibility, String> reason;
}
