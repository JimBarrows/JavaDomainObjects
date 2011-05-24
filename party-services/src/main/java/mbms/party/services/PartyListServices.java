package mbms.party.services;

import java.util.List;

import javax.ejb.Remote;

import com.nsfwenterprises.biz360.party.model.Party;

@Remote
public interface PartyListServices {
	
	public List<Party> list();

	public List<Party> list(int from, int through);

}