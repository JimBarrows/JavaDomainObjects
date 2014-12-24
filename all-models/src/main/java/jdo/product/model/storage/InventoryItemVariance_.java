package jdo.product.model.storage;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-24T16:23:57.491-0700")
@StaticMetamodel(InventoryItemVariance.class)
public class InventoryItemVariance_ {
	public static volatile SingularAttribute<InventoryItemVariance, InventoryItem> adjustmentFor;
	public static volatile SingularAttribute<InventoryItemVariance, String> comment;
	public static volatile SingularAttribute<InventoryItemVariance, Reason> explainedWith;
	public static volatile SingularAttribute<InventoryItemVariance, Date> physicalInventoryDate;
	public static volatile SingularAttribute<InventoryItemVariance, Long> quantity;
}
