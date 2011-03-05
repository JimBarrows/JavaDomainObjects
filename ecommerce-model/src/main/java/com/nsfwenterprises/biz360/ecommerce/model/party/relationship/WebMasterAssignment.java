package com.nsfwenterprises.biz360.ecommerce.model.party.relationship;

import javax.persistence.Entity;

import com.nsfwenterprises.biz360.party.model.PartyRole;
import com.nsfwenterprises.biz360.party.model.relationship.PartyRelationship;

@Entity
public class WebMasterAssignment extends PartyRelationship {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public PartyRole getRelationshipFrom() {
		return (PartyRole)super.getRelationshipFrom();
	}

	@Override
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
