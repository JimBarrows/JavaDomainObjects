package jdo.product.model.storage;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-02T21:45:38.370-0700")
@StaticMetamodel(InventoryItemVariance.class)
public class InventoryItemVariance_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<InventoryItemVariance, InventoryItem> adjustmentFor;
	public static volatile SingularAttribute<InventoryItemVariance, String> comment;
	public static volatile SingularAttribute<InventoryItemVariance, Reason> explainedWith;
	public static volatile SingularAttribute<InventoryItemVariance, Date> physicalInventoryDate;
	public static volatile SingularAttribute<InventoryItemVariance, Long> quantity;
}
