package mbmp.workeffort.type;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseType_;
import mbmp.product.model.Product;
import mbmp.workeffort.requirement.DeliverableType;

@Generated(value="Dali", date="2014-11-07T06:11:39.844-0700")
@StaticMetamodel(WorkEffortType.class)
public class WorkEffortType_ extends BaseType_ {
	public static volatile ListAttribute<WorkEffortType, WorkEffortType> breaksDownInto;
	public static volatile ListAttribute<WorkEffortType, WorkEffortType> dependsOn;
	public static volatile ListAttribute<WorkEffortType, WorkEffortGoodStandard> goodStandardNeeds;
	public static volatile SingularAttribute<WorkEffortType, DeliverableType> usedToProduceDeliverable;
	public static volatile SingularAttribute<WorkEffortType, Product> usedToProduceProduct;
	public static volatile SingularAttribute<WorkEffortType, Integer> standardWorkHours;
}
