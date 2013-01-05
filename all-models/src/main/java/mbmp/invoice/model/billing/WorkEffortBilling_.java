package mbmp.invoice.model.billing;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.workeffort.WorkEffort;

@Generated(value="Dali", date="2013-01-04T22:11:20.483-0700")
@StaticMetamodel(WorkEffortBilling.class)
public class WorkEffortBilling_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WorkEffortBilling, Integer> percentage;
	public static volatile SingularAttribute<WorkEffortBilling, WorkEffort> percentageOf;
}
