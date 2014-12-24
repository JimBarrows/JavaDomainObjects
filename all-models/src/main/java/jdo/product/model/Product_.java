package jdo.product.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.product.model.category.ProductCategoryClassification;
import jdo.product.model.cost.EstimatedProductCost;
import jdo.product.model.feature.interaction.ProductFeatureInteraction;
import jdo.product.model.measurement.UnitOfMeasure;
import jdo.product.model.part.ProductComponent;
import jdo.product.model.price.PriceComponent;

@Generated(value="Dali", date="2014-12-24T16:23:57.414-0700")
@StaticMetamodel(Product.class)
public class Product_ {
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
