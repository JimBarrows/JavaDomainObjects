package com.bizondemand.biz360.humanresoures_workeffort.workeffort.assignment;

import com.bizondemand.biz360.humanresoures_workeffort.workeffort.rate.WorkEffortAssignmentRate;

import java.util.List;

/**
 * @author jimbarrows
 * @version 1.0
 * @created: Apr 2, 2010 10:13:42 AM
 */
public class WorkEffortPartyAssignment extends com.nsfwenterprises.biz360.workeffort.assignment.WorkEffortPartyAssignment{

    private List<WorkEffortAssignmentRate> rateOf;

    public List<WorkEffortAssignmentRate> getRateOf() {
        return rateOf;
    }

    public void setRateOf(List<WorkEffortAssignmentRate> rateOf) {
        this.rateOf = rateOf;
    }
}