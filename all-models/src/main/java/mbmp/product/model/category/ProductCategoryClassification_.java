package mbmp.product.model.category;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.product.model.Product;

@Generated(value="Dali", date="2013-01-05T07:42:06.987-0700")
@StaticMetamodel(ProductCategoryClassification.class)
public class ProductCategoryClassification_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<ProductCategoryClassification, Product> categoryFor;
	public static volatile SingularAttribute<ProductCategoryClassification, String> comment;
	public static volatile SingularAttribute<ProductCategoryClassification, ProductCategory> definedBy;
	public static volatile SingularAttribute<ProductCategoryClassification, Boolean> primary;
}
