package jdo.invoice.model.billing;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.workeffort.WorkEffort;

@Generated(value="Dali", date="2014-12-31T07:51:40.097-0700")
@StaticMetamodel(WorkEffortBilling.class)
public class WorkEffortBilling_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WorkEffortBilling, Integer> percentage;
	public static volatile SingularAttribute<WorkEffortBilling, WorkEffort> percentageOf;
}
