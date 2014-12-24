package jdo.product.model.feature.interaction;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.product.model.Product;
import jdo.product.model.feature.ProductFeature;

@Generated(value="Dali", date="2014-12-24T16:23:56.453-0700")
@StaticMetamodel(ProductFeatureInteraction.class)
public class ProductFeatureInteraction_ {
	public static volatile SingularAttribute<ProductFeatureInteraction, ProductFeature> AFactorIn;
	public static volatile SingularAttribute<ProductFeatureInteraction, Product> applicableWithinTheContextOf;
	public static volatile SingularAttribute<ProductFeatureInteraction, ProductFeature> of;
}
