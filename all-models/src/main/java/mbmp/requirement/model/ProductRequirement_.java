package mbmp.requirement.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.product.model.Product;

@Generated(value="Dali", date="2013-01-04T22:11:23.141-0700")
@StaticMetamodel(ProductRequirement.class)
public class ProductRequirement_ extends Requirement_ {
	public static volatile SingularAttribute<ProductRequirement, Product> requesting;
	public static volatile ListAttribute<ProductRequirement, DesiredFeature> specifying;
}
