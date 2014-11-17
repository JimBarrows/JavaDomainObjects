package jdo.party.services;

import javax.ejb.Remote;

import jdo.party.model.PartyRoleType;

@Remote
public interface PartyRoleTypeCrudServices {

	public void create( PartyRoleType partyRoleType);
	public void delete(PartyRoleType partyRoleType);
	public PartyRoleType update(PartyRoleType partyRoleType);
	public PartyRoleType read(Long id);

}
