package com.nsfwenterprises.biz360.shipment.model.issuance;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.party.model.Party;

@Entity
public class ItemIssuanceRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Party roleFor;
	
	private ItemIssuanceRoleType type;

	@ManyToOne
	public Party getRoleFor() {
		return roleFor;
	}

	@ManyToOne
	public ItemIssuanceRoleType getType() {
		return type;
	}

	public void setRoleFor(Party roleFor) {
		this.roleFor = roleFor;
	}

	public void setType(ItemIssuanceRoleType type) {
		this.type = type;
	}
}