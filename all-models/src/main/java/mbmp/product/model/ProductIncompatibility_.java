package mbmp.product.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2013-01-05T07:42:07.191-0700")
@StaticMetamodel(ProductIncompatibility.class)
public class ProductIncompatibility_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<ProductIncompatibility, Product> aUseOf;
	public static volatile SingularAttribute<ProductIncompatibility, Product> productFor;
	public static volatile SingularAttribute<ProductIncompatibility, String> reason;
}
