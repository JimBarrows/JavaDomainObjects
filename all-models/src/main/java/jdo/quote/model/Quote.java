package jdo.quote.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.model.BasePersistentModel;
import jdo.party.model.Party;

@Entity
public class Quote extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Lob
	private String description;

	@ManyToOne
	private Party givenTo;

	@Temporal(TemporalType.DATE)
	private Date issueDate;
	@ManyToOne
	private Party issuedBy;
	@OneToMany
	private List<QuoteItem> items;
	@OneToMany
	private List<QuoteRole> roles;
	@OneToMany
	private List<QuoteTerm> terms;
	@Temporal(TemporalType.DATE)
	private Date validFrom;
	@Temporal(TemporalType.DATE)
	private Date validThru;

	public String getDescription() {
		return description;
	}

	public Party getGivenTo() {
		return givenTo;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public Party getIssuedBy() {
		return issuedBy;
	}

	public List<QuoteItem> getItems() {
		return items;
	}

	public List<QuoteRole> getRoles() {
		return roles;
	}

	public List<QuoteTerm> getTerms() {
		return terms;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public Date getValidThru() {
		return validThru;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setGivenTo(Party givenTo) {
		this.givenTo = givenTo;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public void setIssuedBy(Party issuedTo) {
		this.issuedBy = issuedTo;
	}

	public void setItems(List<QuoteItem> items) {
		this.items = items;
	}

	public void setRoles(List<QuoteRole> roles) {
		this.roles = roles;
	}

	public void setTerms(List<QuoteTerm> terms) {
		this.terms = terms;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public void setValidThru(Date validThru) {
		this.validThru = validThru;
	}
}
