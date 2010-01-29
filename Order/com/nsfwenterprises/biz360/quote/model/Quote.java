package com.nsfwenterprises.biz360.quote.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.party.model.Party;

@Entity
public class Quote extends BasePersistentModel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String description;
	
	private Party givenTo;
	
	private Date issueDate;
	
	private Party issuedBy;
	
	private List<QuoteItem> items;
	
	private List<QuoteRole> roles;
	
	private List<QuoteTerm> terms;
	
	private Date validFrom;
	
	private Date validThru;
	
	@Lob
	public String getDescription() {
		return description;
	}
	@ManyToOne
	public Party getGivenTo() {
		return givenTo;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getIssueDate() {
		return issueDate;
	}
	
	@ManyToOne
	public Party getIssuedBy() {
		return issuedBy;
	}
	
	@OneToMany
	public List<QuoteItem> getItems() {
		return items;
	}
	@OneToMany
	public List<QuoteRole> getRoles() {
		return roles;
	}
	
	@OneToMany
	public List<QuoteTerm> getTerms() {
		return terms;
	}
	@Temporal(TemporalType.DATE)
	public Date getValidFrom() {
		return validFrom;
	}
	
	@Temporal(TemporalType.DATE)
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
