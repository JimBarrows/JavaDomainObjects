package jdo.party.controllers.party.organization;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import jdo.party.model.Organization;

@ManagedBean(name = "OrganizationAdd")
@ViewScoped
public class Add extends Template{

	public String save() {

		partyRepository.create(organization);

		return "/index?faces-redirect=true&includeViewParams=true";
	}
	
	@PostConstruct
	public void init() {
		organization = new Organization();
	}
	
}
