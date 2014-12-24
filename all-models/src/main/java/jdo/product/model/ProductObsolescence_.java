package jdo.product.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-24T16:23:57.435-0700")
@StaticMetamodel(ProductObsolescence.class)
public class ProductObsolescence_ {
	public static volatile SingularAttribute<ProductObsolescence, Product> AUseOf;
	public static volatile SingularAttribute<ProductObsolescence, Product> obsolescenceFor;
	public static volatile SingularAttribute<ProductObsolescence, String> reason;
	public static volatile SingularAttribute<ProductObsolescence, Date> supercessionDate;
}
