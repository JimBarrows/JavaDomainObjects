package mbmp.humanresoures_workeffort.workeffort.assignment;


import java.util.List;

import mbmp.humanresoures_workeffort.workeffort.rate.WorkEffortAssignmentRate;

/**
 * @author jimbarrows
 * @version 1.0
 * @created: Apr 2, 2010 10:13:42 AM
 */
public class WorkEffortPartyAssignment extends com.nsfwenterprises.biz360.workeffort.assignment.WorkEffortPartyAssignment{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<WorkEffortAssignmentRate> rateOf;

    public List<WorkEffortAssignmentRate> getRateOf() {
        return rateOf;
    }

    public void setRateOf(List<WorkEffortAssignmentRate> rateOf) {
        this.rateOf = rateOf;
    }
}
