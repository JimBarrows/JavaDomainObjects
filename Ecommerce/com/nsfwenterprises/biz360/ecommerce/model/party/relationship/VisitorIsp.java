package com.nsfwenterprises.biz360.ecommerce.model.party.relationship;

import javax.persistence.Entity;

import com.nsfwenterprises.biz360.ecommerce.model.party.role.Isp;
import com.nsfwenterprises.biz360.ecommerce.model.party.role.Visitor;
import com.nsfwenterprises.biz360.party.model.relationship.PartyRelationship;

@Entity
public class VisitorIsp extends PartyRelationship {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Isp getRelationshipFrom() {
		return (Isp)super.getRelationshipFrom();
	}

	@Override
	public Visitor getRelationshipTo() {
		return (Visitor)super.getRelationshipTo();
	}

	public void setRelationshipFrom(Isp relationshipFrom) {
		super.setRelationshipFrom(relationshipFrom);
	}
	
	public void setRelationshipTo(Visitor relationshipTo) {
		super.setRelationshipTo(relationshipTo);
	}
	
	

}
