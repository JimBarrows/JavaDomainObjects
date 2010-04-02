package com.nsfwenterprises.biz360.ecommerce.model.party.relationship;

import javax.persistence.Entity;

import com.nsfwenterprises.biz360.ecommerce.model.party.role.AutomatedAgentRole;
import com.nsfwenterprises.biz360.ecommerce.model.party.role.Webmaster;
import com.nsfwenterprises.biz360.party.model.relationship.PartyRelationship;

@Entity
public class WebMasterAssignment extends PartyRelationship {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public AutomatedAgentRole getRelationshipFrom() {
		return (AutomatedAgentRole)super.getRelationshipFrom();
	}

	@Override
	public Webmaster getRelationshipTo() {
		return (Webmaster)super.getRelationshipTo();
	}

	public void setRelationshipFrom(AutomatedAgentRole relationshipFrom) {
		super.setRelationshipFrom(relationshipFrom);
	}
	
	public void setRelationshipTo(Webmaster relationshipTo) {
		super.setRelationshipTo(relationshipTo);
	}
	
	

}
