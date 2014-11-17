package jdo.party.controllers.party.roleType;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import jdo.party.model.PartyRoleType;
import jdo.party.services.PartyRoleTypeCrudServices;
import jdo.party.services.PartyRoleTypeServices;

@ManagedBean(name="partyRoleTypeIndex")
@RequestScoped
public class Index {
	@EJB
	private PartyRoleTypeServices	partyRoleTypeServices;
	@EJB
	private PartyRoleTypeCrudServices partyRoleTypeCrudServices;
	
	private int	maxResults = 100;
	private int	firstResult = 0;
	private List<PartyRoleType> list;
	
	@PostConstruct
	public void init() {
		list = partyRoleTypeServices.list(firstResult, maxResults);
	}
	
	public String delete(PartyRoleType partyRoleType) {
		partyRoleTypeCrudServices.delete(partyRoleType);
		return "/party/roleType/index?faces-redirect=true&includeViewParams=true";
	}

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

	public List<PartyRoleType> list() {
		return list;
	}
}
