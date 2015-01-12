package jdo.workeffort.type;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.product.model.Product;
import jdo.workeffort.requirement.DeliverableType;

@Generated(value="Dali", date="2015-01-12T07:32:09.713-0700")
@StaticMetamodel(WorkEffortType.class)
public class WorkEffortType_ extends BasePersistentModel_ {
	public static volatile ListAttribute<WorkEffortType, WorkEffortType> breaksDownInto;
	public static volatile ListAttribute<WorkEffortType, WorkEffortType> dependsOn;
	public static volatile ListAttribute<WorkEffortType, WorkEffortGoodStandard> goodStandardNeeds;
	public static volatile SingularAttribute<WorkEffortType, Integer> standardWorkHours;
	public static volatile SingularAttribute<WorkEffortType, DeliverableType> usedToProduceDeliverable;
	public static volatile SingularAttribute<WorkEffortType, Product> usedToProduceProduct;
}
