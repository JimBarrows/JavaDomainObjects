package com.nsfwenterprises.biz360.party.model.relationship;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.humanresoures.model.termination.TerminationType;
import com.nsfwenterprises.biz360.party.model.role.Employee;
import com.nsfwenterprises.biz360.party.model.role.InternalOrganization;

@Entity
public class Employment extends PartyRelationship {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TerminationReason dueTo;
	
	private TerminationType terminationType;

	@ManyToOne
	public TerminationReason getDueTo() {
		return dueTo;
	}

	public InternalOrganization getRelationshipFrom() {
		return (InternalOrganization)super.getRelationshipFrom();
	}


	public Employee getRelationshipTo() {
		return (Employee)super.getRelationshipTo();
	}

	@ManyToOne
	public TerminationType getTerminationType() {
		return terminationType;
	}

	public void setDueTo(TerminationReason dueTo) {
		this.dueTo = dueTo;
	}

	public void setRelationshipFrom(InternalOrganization relationshipFrom) {
		super.setRelationshipFrom(relationshipFrom);
	}

	public void setRelationshipTo(Employee relationshipTo) {
		super.setRelationshipTo(relationshipTo);
	}

	public void setTerminationType(TerminationType terminationType) {
		this.terminationType = terminationType;
	}
}
