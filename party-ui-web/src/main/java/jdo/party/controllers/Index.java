package jdo.party.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

import jdo.party.model.Party;
import jdo.party.repositories.PartyRepository;

@ManagedBean
@RequestScoped
public class Index {

	@EJB
	private PartyRepository partyRepository;
	
	private int	maxResults = 100;
	private int	firstResult = 0;
	private List<Party> list;
	
	@PostConstruct
	public void init() {
		list = partyRepository.findAll();
	}
	public String delete(Party party) {
		partyRepository.delete(party.getId());
		return "index?faces-redirect=true&includeViewParams=true";
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

	public List<Party> list() {
		return list;
	}
}
