package jdo.party.controllers.party.role;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import jdo.party.model.PartyRole;

@ManagedBean(name = "PartyRoleAdd")
@ViewScoped
public class Add extends Template {

	@Override
	public String save() {
		PartyRole partyRole = new PartyRole(from, thru, roleType);
		party = partyCrud.read(party.getId());
		party.addPartyRole(partyRole);

		return String.format("/party/person/edit?person=%d&faces-redirect=true&includeViewParams=true", party.getId());
	}
	
	@PostConstruct
	public void init() {
		roleTypeList = partyRoleTypeServices.list(0, 100);
	}

}
