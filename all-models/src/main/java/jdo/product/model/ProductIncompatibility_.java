package jdo.product.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-02T21:45:38.330-0700")
@StaticMetamodel(ProductIncompatibility.class)
public class ProductIncompatibility_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ProductIncompatibility, Product> aUseOf;
	public static volatile SingularAttribute<ProductIncompatibility, Product> productFor;
	public static volatile SingularAttribute<ProductIncompatibility, String> reason;
	public static volatile SingularAttribute<ProductIncompatibility, DateTimeRange> dateTimeRange;
}
