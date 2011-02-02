package com.nsfwenterprises.biz360.requirement.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;
import com.nsfwenterprises.biz360.party.model.Party;

@Entity
public class RequirementRole extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Party assignedTo;
	
	private Requirement relatedTo;
	
	private RequirementRoleType type;

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
