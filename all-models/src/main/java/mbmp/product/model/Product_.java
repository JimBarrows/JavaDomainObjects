package mbmp.product.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.product.model.category.ProductCategoryClassification;
import mbmp.product.model.cost.EstimatedProductCost;
import mbmp.product.model.feature.interaction.ProductFeatureInteraction;
import mbmp.product.model.measurement.UnitOfMeasure;
import mbmp.product.model.part.ProductComponent;
import mbmp.product.model.price.PriceComponent;

@Generated(value="Dali", date="2013-01-04T22:11:22.820-0700")
@StaticMetamodel(Product.class)
public class Product_ extends BasePersistentModel_ {
	public static volatile ListAttribute<Product, ProductObsolescence> AReplacement;
	public static volatile ListAttribute<Product, ProductCategoryClassification> categorizedBy;
	public static volatile SingularAttribute<Product, String> comment;
	public static volatile ListAttribute<Product, ProductComplement> complimentedWith;
	public static volatile ListAttribute<Product, ProductComplement> complimentFor;
	public static volatile ListAttribute<Product, EstimatedProductCost> costedBy;
	public static volatile ListAttribute<Product, ProductIncompatibility> incompatibleWith;
	public static volatile SingularAttribute<Product, Date> introductionDate;
	public static volatile ListAttribute<Product, ProductComponent> madeUpOf;
	public static volatile SingularAttribute<Product, UnitOfMeasure> measuredUsing;
	public static volatile SingularAttribute<Product, String> name;
	public static volatile ListAttribute<Product, PriceComponent> pricedBy;
	public static volatile SingularAttribute<Product, Date> salesDiscontinuationDate;
	public static volatile ListAttribute<Product, ProductSubstitute> substitutedBy;
	public static volatile ListAttribute<Product, ProductObsolescence> supercededBy;
	public static volatile SingularAttribute<Product, Date> supportDiscontinuationDate;
	public static volatile ListAttribute<Product, ProductSubstitute> usedAs;
	public static volatile ListAttribute<Product, ProductComponent> usedIn;
	public static volatile ListAttribute<Product, ProductFeatureInteraction> usedToDefine;
}
