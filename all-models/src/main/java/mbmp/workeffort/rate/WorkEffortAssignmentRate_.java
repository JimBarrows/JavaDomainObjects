package mbmp.workeffort.rate;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.humanresoures.model.position.salary.RateType;
import mbmp.model.BaseDateRangeModel_;
import mbmp.workeffort.assignment.WorkEffortPartyAssignment;

@Generated(value="Dali", date="2013-01-05T07:42:07.472-0700")
@StaticMetamodel(WorkEffortAssignmentRate.class)
public class WorkEffortAssignmentRate_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<WorkEffortAssignmentRate, WorkEffortPartyAssignment> rateOf;
	public static volatile SingularAttribute<WorkEffortAssignmentRate, RateType> rateType;
}
