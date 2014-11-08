package mbmp.workeffort.inventory;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.product.model.storage.InventoryItem;

@Generated(value="Dali", date="2014-11-07T06:11:39.812-0700")
@StaticMetamodel(WorkEffortInvenotryAssignment.class)
public class WorkEffortInvenotryAssignment_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WorkEffortInvenotryAssignment, InventoryItem> useOf;
	public static volatile SingularAttribute<WorkEffortInvenotryAssignment, Integer> quantity;
}
