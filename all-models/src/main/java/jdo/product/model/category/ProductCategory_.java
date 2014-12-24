package jdo.product.model.category;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.product.model.price.PriceComponent;

@Generated(value="Dali", date="2014-12-24T16:23:56.415-0700")
@StaticMetamodel(ProductCategory.class)
public class ProductCategory_ {
	public static volatile SingularAttribute<ProductCategory, String> description;
	public static volatile ListAttribute<ProductCategory, ProductCategory> madeUpOf;
	public static volatile ListAttribute<ProductCategory, MarketInterest> ofInterestTo;
	public static volatile SingularAttribute<ProductCategory, ProductCategory> partOf;
	public static volatile ListAttribute<ProductCategory, ProductCategoryClassification> usedToDefine;
	public static volatile ListAttribute<ProductCategory, PriceComponent> usedToDefinePrice;
}
