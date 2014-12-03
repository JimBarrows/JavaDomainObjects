package jdo.product.model.feature;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.product.model.Product;

@Generated(value="Dali", date="2014-12-02T21:09:20.206-0700")
@StaticMetamodel(ProductFeatureApplicability.class)
public class ProductFeatureApplicability_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ProductFeatureApplicability, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<ProductFeatureApplicability, ProductFeature> usedToDefine;
	public static volatile SingularAttribute<ProductFeatureApplicability, Product> availableWith;
}
