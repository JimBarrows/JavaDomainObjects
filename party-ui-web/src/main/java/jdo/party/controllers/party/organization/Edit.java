package jdo.party.controllers.party.organization;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import jdo.party.model.Organization;

@ManagedBean(name = "OrganizationEdit")
@ViewScoped
public class Edit extends Template{		
	
	public String save() {		
		
		partyRepository.update(organization);

		return "/index?faces-redirect=true&includeViewParams=true";
	}
		
	public void preRenderView() {
		if (organization == null) {
			organization = new Organization();
		}
	}
	
}
