package jdo.requirement.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;

@Entity
public class RequirementStatus extends BasePersistentModel {

	private static final long serialVersionUID = 1L;
	@ManyToOne
	private RequirementStatusType type;
	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public RequirementStatusType getType() {
		return type;
	}

	public void setType(final RequirementStatusType type) {
		this.type = type;
	}
}
