package jdo.ecommerce.model.productdescriptions;

import java.io.File;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;
import jdo.product.model.Product;
import jdo.product.model.feature.ProductFeature;

@Generated(value="Dali", date="2014-12-02T21:53:26.796-0700")
@StaticMetamodel(DescriptionObject.class)
public class DescriptionObject_ extends BasePersistentModel_ {
	public static volatile ListAttribute<DescriptionObject, ProductFeature> describes;
	public static volatile ListAttribute<DescriptionObject, Product> forProduct;
	public static volatile ListAttribute<DescriptionObject, Party> ofParty;
	public static volatile SingularAttribute<DescriptionObject, ObjectType> type;
	public static volatile ListAttribute<DescriptionObject, ObjectPurpose> usedFor;
	public static volatile ListAttribute<DescriptionObject, ObjectUsage> usedWithin;
	public static volatile SingularAttribute<DescriptionObject, String> description;
	public static volatile SingularAttribute<DescriptionObject, File> location;
	public static volatile SingularAttribute<DescriptionObject, String> name;
}
