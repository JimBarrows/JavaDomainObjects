package jdo.product.model.part;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.DateTimeRange;
import jdo.product.model.Product;

@Generated(value="Dali", date="2014-12-24T16:34:41.941-0700")
@StaticMetamodel(ProductComponent.class)
public class ProductComponent_ {
	public static volatile SingularAttribute<ProductComponent, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<ProductComponent, String> comment;
	public static volatile SingularAttribute<ProductComponent, Product> in;
	public static volatile SingularAttribute<ProductComponent, String> instruction;
	public static volatile SingularAttribute<ProductComponent, Product> productFor;
	public static volatile SingularAttribute<ProductComponent, Long> quantityUsed;
}
