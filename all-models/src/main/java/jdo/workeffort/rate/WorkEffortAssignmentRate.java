package jdo.workeffort.rate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.humanresoures.model.position.salary.RateType;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.workeffort.assignment.WorkEffortPartyAssignment;

@Entity
public class WorkEffortAssignmentRate extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long			serialVersionUID	= 1L;

	private WorkEffortPartyAssignment	rateOf;

	private RateType					rateType;

	private DateTimeRange				dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

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
