package jdo.workeffort.rate;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.humanresoures.model.position.salary.RateType;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.workeffort.assignment.WorkEffortPartyAssignment;

@Generated(value="Dali", date="2014-12-02T21:59:11.813-0700")
@StaticMetamodel(WorkEffortAssignmentRate.class)
public class WorkEffortAssignmentRate_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WorkEffortAssignmentRate, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<WorkEffortAssignmentRate, WorkEffortPartyAssignment> rateOf;
	public static volatile SingularAttribute<WorkEffortAssignmentRate, RateType> rateType;
}
