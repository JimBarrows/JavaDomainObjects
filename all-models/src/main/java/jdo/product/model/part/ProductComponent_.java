package jdo.product.model.part;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.product.model.Product;

@Generated(value="Dali", date="2014-11-07T22:13:43.159-0700")
@StaticMetamodel(ProductComponent.class)
public class ProductComponent_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<ProductComponent, String> comment;
	public static volatile SingularAttribute<ProductComponent, Product> in;
	public static volatile SingularAttribute<ProductComponent, String> instruction;
	public static volatile SingularAttribute<ProductComponent, Product> productFor;
	public static volatile SingularAttribute<ProductComponent, Long> quantityUsed;
}
