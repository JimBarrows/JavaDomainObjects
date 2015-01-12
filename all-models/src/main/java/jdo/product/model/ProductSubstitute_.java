package jdo.product.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2015-01-12T06:59:45.774-0700")
@StaticMetamodel(ProductSubstitute.class)
public class ProductSubstitute_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ProductSubstitute, Product> aUseOf;
	public static volatile SingularAttribute<ProductSubstitute, String> comment;
	public static volatile SingularAttribute<ProductSubstitute, Long> quantity;
	public static volatile SingularAttribute<ProductSubstitute, Product> substituteFor;
	public static volatile SingularAttribute<ProductSubstitute, DateTimeRange> dateTimeRange;
}
