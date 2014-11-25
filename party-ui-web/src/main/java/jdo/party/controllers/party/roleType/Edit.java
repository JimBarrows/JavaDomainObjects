package jdo.party.controllers.party.roleType;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import jdo.party.model.PartyRoleType;

@ManagedBean(name = "PartyRoleTypeEdit")
@ViewScoped
public class Edit extends Template{		
	
	public String save() {		
		
		partyRoleTypeRepository.update(partyRoleType);

		return "/party/roleType/index?faces-redirect=true&includeViewParams=true";
	}
		
	public void preRenderView() {
		if (partyRoleType == null) {
			partyRoleType = new PartyRoleType();
		}
	}
	
}
