package jdo.product.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-24T16:24:59.052-0700")
@StaticMetamodel(ProductIncompatibility.class)
public class ProductIncompatibility_ {
	public static volatile SingularAttribute<ProductIncompatibility, Product> aUseOf;
	public static volatile SingularAttribute<ProductIncompatibility, Product> productFor;
	public static volatile SingularAttribute<ProductIncompatibility, String> reason;
	public static volatile SingularAttribute<ProductIncompatibility, DateTimeRange> dateTimeRange;
}
