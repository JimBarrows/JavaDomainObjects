package jdo.request.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.party.model.Party;

@Entity
public class RequestRole extends BasePersistentModel {

	private static final long	serialVersionUID	= 1L;

	private Party				party;

	private RequestRoleType		roleType;

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
