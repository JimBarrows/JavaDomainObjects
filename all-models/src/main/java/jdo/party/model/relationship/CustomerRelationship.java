package jdo.party.model.relationship;

import javax.persistence.Entity;

import jdo.party.model.roles.Customer;
import jdo.party.model.roles.InternalOrganization;


@Entity
public class CustomerRelationship extends PartyRelationship {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InternalOrganization getRelationshipFrom() {
		return (InternalOrganization)super.getRelationshipFrom();
	}

	public Customer getRelationshipTo() {
		return (Customer)super.getRelationshipTo();
	}


	public void setRelationshipFrom(InternalOrganization relationshipFrom) {
		super.setRelationshipFrom(relationshipFrom);
	}

	public void setRelationshipTo(Customer relationshipTo) {
		super.setRelationshipTo(relationshipTo);
	}

	
}
