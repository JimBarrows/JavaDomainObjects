package mbmp.product.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2013-01-05T07:42:07.172-0700")
@StaticMetamodel(ProductComplement.class)
public class ProductComplement_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<ProductComplement, Product> aUseOf;
	public static volatile SingularAttribute<ProductComplement, Product> complementFor;
	public static volatile SingularAttribute<ProductComplement, String> reason;
}
