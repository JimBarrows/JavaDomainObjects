package mbmp.workeffort.rate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import mbmp.humanresoures.model.position.salary.RateType;
import mbmp.model.BaseDateRangeModel;
import mbmp.workeffort.assignment.WorkEffortPartyAssignment;

@Entity
public class WorkEffortAssignmentRate extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private WorkEffortPartyAssignment rateOf;
	
	private RateType rateType;

	@ManyToOne
	public WorkEffortPartyAssignment getRateOf() {
		return rateOf;
	}

	@ManyToOne
	public RateType getRateType() {
		return rateType;
	}

	public void setRateOf(WorkEffortPartyAssignment rateOf) {
		this.rateOf = rateOf;
	}

	public void setRateType(RateType rateType) {
		this.rateType = rateType;
	}

}
