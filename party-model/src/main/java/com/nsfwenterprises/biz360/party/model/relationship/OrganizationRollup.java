package com.nsfwenterprises.biz360.party.model.relationship;

import javax.persistence.Entity;

import com.nsfwenterprises.biz360.party.model.PartyRole;

@Entity
public class OrganizationRollup extends PartyRelationship {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	
	public PartyRole getRelationshipFrom() {
		return (PartyRole)super.getRelationshipFrom();
	}

	public PartyRole getRelationshipTo() {
		return (PartyRole)super.getRelationshipTo();
	}


	public void setRelationshipFrom(PartyRole relationshipFrom) {
		super.setRelationshipFrom(relationshipFrom);
	}

	public void setRelationshipTo(PartyRole relationshipTo) {
		super.setRelationshipTo(relationshipTo);
	}
}
