package jdo.workeffort.rate;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.humanresoures.model.position.salary.RateType;
import jdo.model.DateTimeRange;
import jdo.workeffort.assignment.WorkEffortPartyAssignment;

@Generated(value="Dali", date="2014-12-24T16:34:42.029-0700")
@StaticMetamodel(WorkEffortAssignmentRate.class)
public class WorkEffortAssignmentRate_ {
	public static volatile SingularAttribute<WorkEffortAssignmentRate, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<WorkEffortAssignmentRate, WorkEffortPartyAssignment> rateOf;
	public static volatile SingularAttribute<WorkEffortAssignmentRate, RateType> rateType;
}
