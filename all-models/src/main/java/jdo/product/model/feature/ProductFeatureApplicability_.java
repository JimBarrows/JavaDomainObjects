package jdo.product.model.feature;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.DateTimeRange;
import jdo.product.model.Product;

@Generated(value="Dali", date="2014-12-24T16:34:41.932-0700")
@StaticMetamodel(ProductFeatureApplicability.class)
public class ProductFeatureApplicability_ {
	public static volatile SingularAttribute<ProductFeatureApplicability, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<ProductFeatureApplicability, Product> availableWith;
	public static volatile SingularAttribute<ProductFeatureApplicability, ProductFeature> usedToDefine;
}
