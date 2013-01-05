package mbmp.product.model.part;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.product.model.Product;

@Generated(value="Dali", date="2013-01-05T07:42:07.122-0700")
@StaticMetamodel(ProductComponent.class)
public class ProductComponent_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<ProductComponent, String> comment;
	public static volatile SingularAttribute<ProductComponent, Product> in;
	public static volatile SingularAttribute<ProductComponent, String> instruction;
	public static volatile SingularAttribute<ProductComponent, Product> productFor;
	public static volatile SingularAttribute<ProductComponent, Long> quantityUsed;
}
