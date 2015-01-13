package jdo.product.model.feature.interaction;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.product.model.Product;
import jdo.product.model.feature.ProductFeature;

@Generated(value="Dali", date="2015-01-13T00:07:01.027-0700")
@StaticMetamodel(ProductFeatureInteraction.class)
public class ProductFeatureInteraction_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ProductFeatureInteraction, ProductFeature> aFactorIn;
	public static volatile SingularAttribute<ProductFeatureInteraction, Product> applicableWithinTheContextOf;
	public static volatile SingularAttribute<ProductFeatureInteraction, ProductFeature> of;
}
