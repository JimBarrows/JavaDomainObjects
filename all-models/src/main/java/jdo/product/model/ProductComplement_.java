package jdo.product.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-02T21:04:07.787-0700")
@StaticMetamodel(ProductComplement.class)
public class ProductComplement_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ProductComplement, Product> aUseOf;
	public static volatile SingularAttribute<ProductComplement, Product> complementFor;
	public static volatile SingularAttribute<ProductComplement, String> reason;
	public static volatile SingularAttribute<ProductComplement, DateTimeRange> dateTimeRange;
}
