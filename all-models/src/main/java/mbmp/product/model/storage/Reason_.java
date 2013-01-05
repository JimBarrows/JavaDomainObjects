package mbmp.product.model.storage;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:22.919-0700")
@StaticMetamodel(Reason.class)
public class Reason_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Reason, String> description;
	public static volatile ListAttribute<Reason, InventoryItemVariance> explanationFor;
}
