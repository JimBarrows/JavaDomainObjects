package jdo.request.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.model.BasePersistentModel;

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
	@Lob
	private String description;
	@OneToMany
	private List<RequestItem> items;
	@Temporal(TemporalType.DATE)
	private Date requestDate;
	@OneToMany
	private List<RespondingParty> respondingParties;
	@Temporal(TemporalType.DATE)
	private Date responseRequired;
	@OneToMany
	private List<RequestRole> roles;

	public String getDescription() {
		return description;
	}

	public List<RequestItem> getItems() {
		return items;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public List<RespondingParty> getRespondingParties() {
		return respondingParties;
	}

	public Date getResponseRequired() {
		return responseRequired;
	}

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
