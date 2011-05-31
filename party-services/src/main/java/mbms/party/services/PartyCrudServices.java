package mbms.party.services;

import javax.ejb.Remote;

import com.nsfwenterprises.biz360.party.model.Party;

@Remote
public interface PartyCrudServices {

	public Party create( Party party);
	
	public Party read( Long id);
	
	public Party update( Party party);
	
	public void delete(Party party);
}
