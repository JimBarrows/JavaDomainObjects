package mbmp.product.model.feature.interaction;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.product.model.Product;
import mbmp.product.model.feature.ProductFeature;

@Generated(value="Dali", date="2013-01-04T22:11:22.576-0700")
@StaticMetamodel(ProductFeatureInteraction.class)
public class ProductFeatureInteraction_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ProductFeatureInteraction, ProductFeature> AFactorIn;
	public static volatile SingularAttribute<ProductFeatureInteraction, Product> applicableWithinTheContextOf;
	public static volatile SingularAttribute<ProductFeatureInteraction, ProductFeature> of;
}
