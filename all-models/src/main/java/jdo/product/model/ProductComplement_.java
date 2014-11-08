package jdo.product.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2014-11-07T22:13:43.232-0700")
@StaticMetamodel(ProductComplement.class)
public class ProductComplement_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<ProductComplement, Product> aUseOf;
	public static volatile SingularAttribute<ProductComplement, Product> complementFor;
	public static volatile SingularAttribute<ProductComplement, String> reason;
}
