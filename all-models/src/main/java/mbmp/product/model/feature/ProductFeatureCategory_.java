package mbmp.product.model.feature;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-05T08:07:17.909-0700")
@StaticMetamodel(ProductFeatureCategory.class)
public class ProductFeatureCategory_ extends BasePersistentModel_ {
	public static volatile ListAttribute<ProductFeatureCategory, ProductFeature> categoryFor;
	public static volatile SingularAttribute<ProductFeatureCategory, String> description;
	public static volatile SingularAttribute<ProductFeatureCategory, String> name;
}
