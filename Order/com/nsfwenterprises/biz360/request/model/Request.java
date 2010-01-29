package com.nsfwenterprises.biz360.request.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

/**
 * A request is inquiry either to or from a PartyRole for a quote.
 * 
 * @author jim
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Request extends BasePersistentModel {

	private static final long serialVersionUID = 1L;

	private String description;

	private List<RequestItem> items;

	private Date requestDate;

	private List<RespondingParty> respondingParties;

	private Date responseRequired;

	private List<RequestRole> roles;

	@Lob
	public String getDescription() {
		return description;
	}

	@OneToMany
	public List<RequestItem> getItems() {
		return items;
	}

	@Temporal(TemporalType.DATE)
	public Date getRequestDate() {
		return requestDate;
	}

	@OneToMany
	public List<RespondingParty> getRespondingParties() {
		return respondingParties;
	}

	@Temporal(TemporalType.DATE)
	public Date getResponseRequired() {
		return responseRequired;
	}

	@OneToMany
	public List<RequestRole> getRoles() {
		return roles;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setItems(List<RequestItem> items) {
		this.items = items;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public void setRespondingParties(List<RespondingParty> respondingParties) {
		this.respondingParties = respondingParties;
	}

	public void setResponseRequired(Date responseRequired) {
		this.responseRequired = responseRequired;
	}

	public void setRoles(List<RequestRole> roles) {
		this.roles = roles;
	}
}
