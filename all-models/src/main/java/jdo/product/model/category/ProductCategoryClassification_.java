package jdo.product.model.category;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.DateTimeRange;
import jdo.product.model.Product;

@Generated(value="Dali", date="2014-12-24T16:34:41.910-0700")
@StaticMetamodel(ProductCategoryClassification.class)
public class ProductCategoryClassification_ {
	public static volatile SingularAttribute<ProductCategoryClassification, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<ProductCategoryClassification, Product> categoryFor;
	public static volatile SingularAttribute<ProductCategoryClassification, String> comment;
	public static volatile SingularAttribute<ProductCategoryClassification, ProductCategory> definedBy;
	public static volatile SingularAttribute<ProductCategoryClassification, Boolean> primary;
}
