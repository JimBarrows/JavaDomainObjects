package jdo.party;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import jdo.party.model.Party;
import jdo.party.services.PartyListServices;

@ManagedBean
@RequestScoped
public class PartyListController {

	@EJB
	private PartyListServices	partyListServices;
	
	private int	maxResults = 100;
	private int	firstResult = 0;

	public int getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(int maxResults) {
		this.maxResults = maxResults;
	}

	public int getFirstResult() {
		return firstResult;
	}

	public void setFirstResult(int firstResult) {
		this.firstResult = firstResult;
	}	

	public List<Party> list() {
		return partyListServices.list(firstResult, maxResults);
	}
}
