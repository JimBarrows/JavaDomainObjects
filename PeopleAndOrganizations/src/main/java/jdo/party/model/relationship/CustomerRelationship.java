package jdo.party.model.relationship;

import javax.persistence.Entity;

import jdo.party.model.roles.Customer;
import jdo.party.model.roles.InternalOrganization;

/**
 * Represents the relationship from an internal organization to one customer.
 *
 * @author Jim
 *
 */
@Entity
public class CustomerRelationship extends PartyRelationship {

	/**
	 * Construct the object from the roles in the relationship.
	 *
	 * @param relationshipFrom
	 *            the internal organization.
	 * @param relationshipTo
	 *            the customer.
	 */
	public CustomerRelationship(final InternalOrganization relationshipFrom, final Customer relationshipTo) {
		super();
		setRelationshipFrom(relationshipFrom);
		setRelationshipTo(relationshipTo);
	}

	/**
	 * Just construct the relationship.
	 *
	 */
	public CustomerRelationship() {
		super();
	}

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public InternalOrganization getRelationshipFrom() {
		return ( InternalOrganization ) super.getRelationshipFrom();
	}

	@Override
	public Customer getRelationshipTo() {
		return ( Customer ) super.getRelationshipTo();
	}

	/**
	 *
	 * @param relationshipFrom
	 *            the internal organization.
	 */
	public void setRelationshipFrom(final InternalOrganization relationshipFrom) {
		super.setRelationshipFrom(relationshipFrom);
	}

	/**
	 *
	 * @param relationshipTo
	 *            the customer.
	 */
	public void setRelationshipTo(final Customer relationshipTo) {
		super.setRelationshipTo(relationshipTo);
	}

}
