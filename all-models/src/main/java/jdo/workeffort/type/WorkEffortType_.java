package jdo.workeffort.type;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.product.model.Product;
import jdo.workeffort.requirement.DeliverableType;

@Generated(value="Dali", date="2014-12-24T17:30:49.470-0700")
@StaticMetamodel(WorkEffortType.class)
public class WorkEffortType_ extends BasePersistentModel_ {
	public static volatile ListAttribute<WorkEffortType, WorkEffortType> breaksDownInto;
	public static volatile ListAttribute<WorkEffortType, WorkEffortType> dependsOn;
	public static volatile ListAttribute<WorkEffortType, WorkEffortGoodStandard> goodStandardNeeds;
	public static volatile SingularAttribute<WorkEffortType, DeliverableType> usedToProduceDeliverable;
	public static volatile SingularAttribute<WorkEffortType, Product> usedToProduceProduct;
	public static volatile SingularAttribute<WorkEffortType, Integer> standardWorkHours;
}
