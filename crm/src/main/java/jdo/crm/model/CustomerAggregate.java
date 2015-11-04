package jdo.crm.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import jdo.party.model.Party;
import jdo.party.model.PartyRole;
import jdo.party.model.relationship.CustomerRelationship;
import jdo.party.model.relationship.PartyRelationship;
import jdo.party.model.roles.Customer;

/**
 * Aggregate class representing the customer of an internal organization.
 *
 * @author Jim
 *
 * @param
 * 			<P>
 *            The specific party type this aggregate is for.
 */
public class CustomerAggregate<P extends Party> implements Aggregate {

	/**
	 * The customer this class represents.
	 *
	 */
	@NotNull
	private P customer;

	public CustomerAggregate() {
		super();
	}

	public CustomerAggregate(final P customer) {
		super();
		this.customer = customer;
	}

	/**
	 *
	 * @return the customer.
	 */
	public P getCustomer() {
		return customer;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see jdo.crm.model.Aggregate#getId()
	 */
	@Override
	@Transient
	public UUID getId() {
		return customer.getId();
	}

	/**
	 *
	 * @param customer
	 *            The customer
	 */
	public void setCustomer(final P customer) {
		this.customer = customer;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see jdo.crm.model.Aggregate#vendors()
	 */
	@Override
	public List<Party> vendors() {
		final List<Party> vendorList = new ArrayList<>();
		for (final PartyRole role : customer.getActingAs()) {
			if ((role instanceof Customer) && (role.getDateTimeRange().isActive())) {
				for (final PartyRelationship relationship : role.getRelationshipsInvolvedIn()) {
					if ((relationship instanceof CustomerRelationship)
							&& (relationship.getDateTimeRange().isActive())) {
						vendorList.add((( CustomerRelationship ) relationship).getRelationshipFrom().getRoleFor());
					}
				}
			}
		}
		return vendorList;
	}
}
