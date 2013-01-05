package mbmp.workeffort.inventory;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.product.model.storage.InventoryItem;

@Generated(value="Dali", date="2013-01-04T22:11:23.550-0700")
@StaticMetamodel(WorkEffortInvenotryAssignment.class)
public class WorkEffortInvenotryAssignment_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WorkEffortInvenotryAssignment, Integer> quantity;
	public static volatile SingularAttribute<WorkEffortInvenotryAssignment, InventoryItem> useOf;
}
