package jdo.requirement.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;

@Entity
public class RequirementStatus extends BasePersistentModel {

	private static final long		serialVersionUID	= 1L;

	private RequirementStatusType	type;

	private DateTimeRange			dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	@ManyToOne
	public RequirementStatusType getType() {
		return type;
	}

	public void setType(final RequirementStatusType type) {
		this.type = type;
	}
}
