package jdo.product.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2015-01-12T06:58:59.627-0700")
@StaticMetamodel(ProductObsolescence.class)
public class ProductObsolescence_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ProductObsolescence, Product> aUseOf;
	public static volatile SingularAttribute<ProductObsolescence, Product> obsolescenceFor;
	public static volatile SingularAttribute<ProductObsolescence, String> reason;
	public static volatile SingularAttribute<ProductObsolescence, Date> supercessionDate;
}
