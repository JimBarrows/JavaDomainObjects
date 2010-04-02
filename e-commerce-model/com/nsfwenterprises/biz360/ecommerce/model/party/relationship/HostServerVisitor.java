package com.nsfwenterprises.biz360.ecommerce.model.party.relationship;

import javax.persistence.Entity;

import com.nsfwenterprises.biz360.ecommerce.model.party.role.HostingServer;
import com.nsfwenterprises.biz360.ecommerce.model.party.role.Visitor;
import com.nsfwenterprises.biz360.party.model.relationship.PartyRelationship;

@Entity
public class HostServerVisitor extends PartyRelationship {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Visitor getRelationshipFrom() {
		return (Visitor)super.getRelationshipFrom();
	}

	@Override
	public HostingServer getRelationshipTo() {
		return (HostingServer)super.getRelationshipTo();
	}

	public void setRelationshipFrom(Visitor relationshipFrom) {
		super.setRelationshipFrom(relationshipFrom);
	}
	
	public void setRelationshipTo(HostingServer relationshipTo) {
		super.setRelationshipTo(relationshipTo);
	}
	
	

}
