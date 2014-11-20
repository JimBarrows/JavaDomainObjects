package jdo.party.controllers.party.role;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.validation.constraints.NotNull;

import jdo.party.model.Party;
import jdo.party.model.PartyRoleType;
import jdo.party.services.PartyCrudServices;
import jdo.party.services.PartyRoleTypeServices;

import org.joda.time.DateTime;

public abstract class Template {

	@EJB
	protected PartyRoleTypeServices	partyRoleTypeServices;	

	@EJB
	protected PartyCrudServices partyCrud;
	
	protected Party party;
	
	protected PartyRoleType roleType;
	
	protected DateTime from = new DateTime();
	
	protected DateTime thru;
	
	protected List<PartyRoleType> roleTypeList = new ArrayList<PartyRoleType>();
	
	public abstract String save();
	
	@NotNull
	public PartyRoleType getRoleType() {
		return roleType;
	}

	public List<PartyRoleType> getRoleTypeList() {
		return roleTypeList;
	}

	public void setRoleType(PartyRoleType roleType) {
		this.roleType = roleType;
	}

	@NotNull
	public DateTime getFrom() {
		return from;
	}

	public void setFrom(DateTime from) {
		this.from = from;
	}

	public DateTime getThru() {
		return thru;
	}

	public void setThru(DateTime thru) {
		this.thru = thru;
	}	

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}
	
	
}
