package jdo.product.model.feature;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.product.model.cost.EstimatedProductCost;
import jdo.product.model.feature.interaction.ProductFeatureInteraction;
import jdo.product.model.price.PriceComponent;

@Generated(value="Dali", date="2014-12-24T16:23:56.467-0700")
@StaticMetamodel(ProductFeature.class)
public class ProductFeature_ {
	public static volatile SingularAttribute<ProductFeature, ProductFeatureCategory> categorizedBy;
	public static volatile ListAttribute<ProductFeature, EstimatedProductCost> costedBy;
	public static volatile ListAttribute<ProductFeature, ProductFeatureInteraction> dependentOnSelectionOf;
	public static volatile SingularAttribute<ProductFeature, String> description;
	public static volatile ListAttribute<ProductFeature, PriceComponent> pricedBy;
	public static volatile ListAttribute<ProductFeature, ProductFeatureInteraction> selectedIn;
	public static volatile ListAttribute<ProductFeature, ProductFeatureApplicability> usedToDefine;
}
