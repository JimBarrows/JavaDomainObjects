package com.nsfwenterprises.biz360.party.model.relationship;

import javax.persistence.Entity;

import com.nsfwenterprises.biz360.party.model.role.OrganizationUnit;

@Entity
public class OrganizationRollup extends PartyRelationship {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	
	public OrganizationUnit getRelationshipFrom() {
		return (OrganizationUnit)super.getRelationshipFrom();
	}

	public OrganizationUnit getRelationshipTo() {
		return (OrganizationUnit)super.getRelationshipTo();
	}


	public void setRelationshipFrom(OrganizationUnit relationshipFrom) {
		super.setRelationshipFrom(relationshipFrom);
	}

	public void setRelationshipTo(OrganizationUnit relationshipTo) {
		super.setRelationshipTo(relationshipTo);
	}
}
