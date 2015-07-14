package jdo.workeffort.model.rate;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.workeffort.model.assignment.WorkEffortPartyAssignment;

@Entity
public class WorkEffortAssignmentRate extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private WorkEffortPartyAssignment rateOf;
	/**
	 * UUID for the RateType.
	 * 
	 */
	private UUID rateType;
	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public WorkEffortPartyAssignment getRateOf() {
		return rateOf;
	}

	public UUID getRateType() {
		return rateType;
	}

	public void setRateOf(WorkEffortPartyAssignment rateOf) {
		this.rateOf = rateOf;
	}

	public void setRateType(UUID rateType) {
		this.rateType = rateType;
	}

}
