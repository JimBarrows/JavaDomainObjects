package jdo.product.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-02T21:59:11.701-0700")
@StaticMetamodel(ProductSubstitute.class)
public class ProductSubstitute_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ProductSubstitute, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<ProductSubstitute, Product> AUseOf;
	public static volatile SingularAttribute<ProductSubstitute, String> comment;
	public static volatile SingularAttribute<ProductSubstitute, Product> substituteFor;
	public static volatile SingularAttribute<ProductSubstitute, Long> quantity;
}
