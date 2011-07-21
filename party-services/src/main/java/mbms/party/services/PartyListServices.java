package mbms.party.services;

import java.util.List;

import mbmp.party.model.Party;

public interface PartyListServices {

	public List<Party> list(int from, int through);

}
