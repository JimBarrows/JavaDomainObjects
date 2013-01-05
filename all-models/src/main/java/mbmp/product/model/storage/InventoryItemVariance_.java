package mbmp.product.model.storage;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:22.892-0700")
@StaticMetamodel(InventoryItemVariance.class)
public class InventoryItemVariance_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<InventoryItemVariance, InventoryItem> adjustmentFor;
	public static volatile SingularAttribute<InventoryItemVariance, String> comment;
	public static volatile SingularAttribute<InventoryItemVariance, Reason> explainedWith;
	public static volatile SingularAttribute<InventoryItemVariance, Date> physicalInventoryDate;
	public static volatile SingularAttribute<InventoryItemVariance, Long> quantity;
}
