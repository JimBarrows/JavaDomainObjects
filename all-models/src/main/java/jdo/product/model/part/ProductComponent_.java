package jdo.product.model.part;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.product.model.Product;

@Generated(value="Dali", date="2015-01-13T08:03:26.773-0700")
@StaticMetamodel(ProductComponent.class)
public class ProductComponent_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ProductComponent, String> comment;
	public static volatile SingularAttribute<ProductComponent, Product> in;
	public static volatile SingularAttribute<ProductComponent, String> instruction;
	public static volatile SingularAttribute<ProductComponent, Product> productFor;
	public static volatile SingularAttribute<ProductComponent, Long> quantityUsed;
	public static volatile SingularAttribute<ProductComponent, DateTimeRange> dateTimeRange;
}
