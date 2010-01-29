package com.nsfwenterprises.biz360.party.model.relationship;

import javax.persistence.Entity;

import com.nsfwenterprises.biz360.party.model.role.Customer;
import com.nsfwenterprises.biz360.party.model.role.InternalOrganization;

@Entity
public class CustomerRelationship extends PartyRelationship {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Customer getRelationshipFrom() {
		return (Customer)super.getRelationshipFrom();
	}

	public InternalOrganization getRelationshipTo() {
		return (InternalOrganization)super.getRelationshipTo();
	}


	public void setRelationshipFrom(Customer relationshipFrom) {
		super.setRelationshipFrom(relationshipFrom);
	}

	public void setRelationshipTo(InternalOrganization relationshipTo) {
		super.setRelationshipTo(relationshipTo);
	}

	
}
