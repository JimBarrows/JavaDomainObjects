package jdo.requirement.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Entity
public class RequirementRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Party assignedTo;
	
	private Requirement relatedTo;
	
	private RequirementRoleType type;
	
	private DateTimeRange	dateTimeRange	= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	@ManyToOne
	public Party getAssignedTo() {
		return assignedTo;
	}

	@ManyToOne
	public Requirement getRelatedTo() {
		return relatedTo;
	}

	@ManyToOne
	public RequirementRoleType getType() {
		return type;
	}

	public void setAssignedTo(final Party assignedTo) {
		this.assignedTo = assignedTo;
	}

	public void setRelatedTo(final Requirement relatedTo) {
		this.relatedTo = relatedTo;
	}

	public void setType(final RequirementRoleType type) {
		this.type = type;
	}
	
	
}
