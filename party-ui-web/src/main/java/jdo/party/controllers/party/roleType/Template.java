package jdo.party.controllers.party.roleType;

import javax.ejb.EJB;

import jdo.party.model.PartyRoleType;
import jdo.party.services.PartyRoleTypeCrudServices;

public abstract class Template {

	@EJB
	protected PartyRoleTypeCrudServices	partyRoleTypeCrud;

	protected PartyRoleType				partyRoleType;
	
	public abstract String save();

	public PartyRoleType getPartyRoleType() {
		return partyRoleType;
	}

	public void setPartyRoleType(PartyRoleType partyRoleType) {
		this.partyRoleType = partyRoleType;
	}
	
	
}
