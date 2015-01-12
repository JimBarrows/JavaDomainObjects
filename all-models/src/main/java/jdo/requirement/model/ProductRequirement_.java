package jdo.requirement.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.product.model.Product;

@Generated(value="Dali", date="2015-01-12T07:15:20.635-0700")
@StaticMetamodel(ProductRequirement.class)
public class ProductRequirement_ extends Requirement_ {
	public static volatile SingularAttribute<ProductRequirement, Product> requesting;
	public static volatile ListAttribute<ProductRequirement, DesiredFeature> specifying;
}
