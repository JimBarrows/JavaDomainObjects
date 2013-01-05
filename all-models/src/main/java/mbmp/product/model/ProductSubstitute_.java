package mbmp.product.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2013-01-05T07:42:07.209-0700")
@StaticMetamodel(ProductSubstitute.class)
public class ProductSubstitute_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<ProductSubstitute, Product> AUseOf;
	public static volatile SingularAttribute<ProductSubstitute, String> comment;
	public static volatile SingularAttribute<ProductSubstitute, Long> quantity;
	public static volatile SingularAttribute<ProductSubstitute, Product> substituteFor;
}
