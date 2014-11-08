package jdo.requirement.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BaseDateRangeModel;

@Entity
public class RequirementStatus extends BaseDateRangeModel {

	private static final long serialVersionUID = 1L;
	
	private RequirementStatusType type;

	@ManyToOne
	public RequirementStatusType getType() {
		return type;
	}

	public void setType(final RequirementStatusType type) {
		this.type = type;
	}
}
