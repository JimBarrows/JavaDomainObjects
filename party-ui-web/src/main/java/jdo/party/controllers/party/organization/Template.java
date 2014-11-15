package jdo.party.controllers.party.organization;

import javax.ejb.EJB;

import jdo.party.model.Organization;
import jdo.party.services.PartyCrudServices;

public abstract class Template {

	@EJB
	protected PartyCrudServices	partyCrud;

	protected Organization				organization;
	
	public abstract String save();
		
	
	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
}
