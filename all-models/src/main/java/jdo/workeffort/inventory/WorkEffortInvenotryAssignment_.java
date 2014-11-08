package jdo.workeffort.inventory;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.product.model.storage.InventoryItem;

@Generated(value="Dali", date="2014-11-07T22:13:43.648-0700")
@StaticMetamodel(WorkEffortInvenotryAssignment.class)
public class WorkEffortInvenotryAssignment_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WorkEffortInvenotryAssignment, InventoryItem> useOf;
	public static volatile SingularAttribute<WorkEffortInvenotryAssignment, Integer> quantity;
}
