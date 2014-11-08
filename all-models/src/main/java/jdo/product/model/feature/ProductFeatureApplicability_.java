package jdo.product.model.feature;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.product.model.Product;

@Generated(value="Dali", date="2014-11-07T22:13:43.091-0700")
@StaticMetamodel(ProductFeatureApplicability.class)
public class ProductFeatureApplicability_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<ProductFeatureApplicability, Product> availableWith;
	public static volatile SingularAttribute<ProductFeatureApplicability, ProductFeature> usedToDefine;
}
