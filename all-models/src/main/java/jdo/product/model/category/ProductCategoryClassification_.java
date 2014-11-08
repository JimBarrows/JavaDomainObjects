package jdo.product.model.category;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.product.model.Product;

@Generated(value="Dali", date="2014-11-07T22:13:43.014-0700")
@StaticMetamodel(ProductCategoryClassification.class)
public class ProductCategoryClassification_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<ProductCategoryClassification, Product> categoryFor;
	public static volatile SingularAttribute<ProductCategoryClassification, String> comment;
	public static volatile SingularAttribute<ProductCategoryClassification, ProductCategory> definedBy;
	public static volatile SingularAttribute<ProductCategoryClassification, Boolean> primary;
}
