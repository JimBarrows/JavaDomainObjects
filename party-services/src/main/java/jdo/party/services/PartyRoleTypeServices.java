package jdo.party.services;

import java.util.List;

import javax.ejb.Remote;

import jdo.party.model.PartyRoleType;

@Remote
public interface PartyRoleTypeServices {

	public List<PartyRoleType> list(int firstResult, int maxResults);
}
