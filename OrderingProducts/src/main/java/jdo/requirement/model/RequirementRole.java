package jdo.requirement.model;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;

@Entity
public class RequirementRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * UUID of the Party.
	 * 
	 */
	private UUID assignedTo;
	@ManyToOne
	private Requirement relatedTo;
	@ManyToOne
	private RequirementRoleType type;
	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public UUID getAssignedTo() {
		return assignedTo;
	}

	public Requirement getRelatedTo() {
		return relatedTo;
	}

	public RequirementRoleType getType() {
		return type;
	}

	public void setAssignedTo(final UUID assignedTo) {
		this.assignedTo = assignedTo;
	}

	public void setRelatedTo(final Requirement relatedTo) {
		this.relatedTo = relatedTo;
	}

	public void setType(final RequirementRoleType type) {
		this.type = type;
	}

}
