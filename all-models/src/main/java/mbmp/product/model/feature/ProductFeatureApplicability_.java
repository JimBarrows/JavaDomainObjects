package mbmp.product.model.feature;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.product.model.Product;

@Generated(value="Dali", date="2013-01-05T08:07:17.901-0700")
@StaticMetamodel(ProductFeatureApplicability.class)
public class ProductFeatureApplicability_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<ProductFeatureApplicability, Product> availableWith;
	public static volatile SingularAttribute<ProductFeatureApplicability, ProductFeature> usedToDefine;
}
