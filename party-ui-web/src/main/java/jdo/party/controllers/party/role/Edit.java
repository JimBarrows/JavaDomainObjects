package jdo.party.controllers.party.role;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import jdo.party.model.Party;
import jdo.party.model.PartyRole;

import org.joda.time.DateTime;

@ManagedBean(name = "PartyRoleEdit")
@ViewScoped
public class Edit extends Template {

	@Override
	public String save() {
		PartyRole partyRole= null; 
	
		if( thru != null) {
			partyRole = new PartyRole(new DateTime(from), new DateTime(thru), roleType);
		} else {
			partyRole = new PartyRole(new DateTime(from), null, roleType);
		}
		Party party = partyRepository.findById(this.party.getId());
		party.addPartyRole(partyRole);
		this.party = partyRepository.update(party);

		return String.format("/party/person/edit?person=%d&faces-redirect=true&includeViewParams=true", party.getId());
	}	

}
