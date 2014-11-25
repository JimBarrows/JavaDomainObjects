package jdo.party.controllers.party.roleType;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import jdo.party.model.PartyRoleType;

@ManagedBean(name = "PartyRoleTypeAdd")
@ViewScoped
public class Add extends Template {

	@Override
	public String save() {
		partyRoleTypeRepository.create(partyRoleType);

		return "/party/roleType/index?faces-redirect=true&includeViewParams=true";
	}
	
	@PostConstruct
	public void init() {
		partyRoleType = new PartyRoleType();
	}

}
