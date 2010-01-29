package com.nsfwenterprises.biz360.request.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.party.model.Party;

@Entity
public class RequestRole extends BasePersistentModel {

	private static final long serialVersionUID = 1L;

	private Party party;
		
	private RequestRoleType roleType;
	
	@ManyToOne
	public Party getParty() {
		return party;
	}

	@ManyToOne
	public RequestRoleType getRoleType() {
		return roleType;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public void setRoleType(RequestRoleType roleType) {
		this.roleType = roleType;
	}
}
