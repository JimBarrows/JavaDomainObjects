package jdo.party.controllers.party.organization;

import javax.ejb.EJB;

import jdo.party.model.Organization;
import jdo.party.repositories.PartyRepository;

public abstract class Template {

	@EJB
	protected PartyRepository	partyRepository;

	protected Organization				organization;
	
	public abstract String save();
		
	
	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
}
