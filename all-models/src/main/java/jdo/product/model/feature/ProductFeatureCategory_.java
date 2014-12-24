package jdo.product.model.feature;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-24T16:23:56.481-0700")
@StaticMetamodel(ProductFeatureCategory.class)
public class ProductFeatureCategory_ {
	public static volatile ListAttribute<ProductFeatureCategory, ProductFeature> categoryFor;
	public static volatile SingularAttribute<ProductFeatureCategory, String> description;
	public static volatile SingularAttribute<ProductFeatureCategory, String> name;
}
