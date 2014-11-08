package jdo.workeffort.rate;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.humanresoures.model.position.salary.RateType;
import jdo.model.BaseDateRangeModel_;
import jdo.workeffort.assignment.WorkEffortPartyAssignment;

@Generated(value="Dali", date="2014-11-07T22:13:43.670-0700")
@StaticMetamodel(WorkEffortAssignmentRate.class)
public class WorkEffortAssignmentRate_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<WorkEffortAssignmentRate, WorkEffortPartyAssignment> rateOf;
	public static volatile SingularAttribute<WorkEffortAssignmentRate, RateType> rateType;
}
