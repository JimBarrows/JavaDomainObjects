package jdo.product.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-24T16:24:59.045-0700")
@StaticMetamodel(ProductComplement.class)
public class ProductComplement_ {
	public static volatile SingularAttribute<ProductComplement, Product> aUseOf;
	public static volatile SingularAttribute<ProductComplement, Product> complementFor;
	public static volatile SingularAttribute<ProductComplement, String> reason;
	public static volatile SingularAttribute<ProductComplement, DateTimeRange> dateTimeRange;
}
