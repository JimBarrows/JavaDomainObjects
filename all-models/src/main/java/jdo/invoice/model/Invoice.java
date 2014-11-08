package jdo.invoice.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

import jdo.invoice.model.billingaccount.BillingAccount;
import jdo.invoice.model.term.InvoiceTerm;
import jdo.model.BasePersistentModel;
import jdo.party.model.Party;
import jdo.party.model.contactmechanism.ContactMechanism;

@Entity
public class Invoice extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ContactMechanism addressedTo;
	
	private Party billedFrom;
	
	private BillingAccount billedToAccount;
	
	private Party billedToParty;
	
	private List<InvoiceItem> composedOf;
		
	private String description;
		
	private Date invoiceDate;
	
	private List<InvoiceRole> involving;
		
	private String message;
	
	private ContactMechanism sentFrom;
	
	private List<InvoiceTerm> terms;
	
//	@OneToOne
//	private SalesAccountingTransaction postedVia;
	
	@AssertTrue
	public boolean billedToPartyXorAccount() {
		return (billedToParty != null) ^ (billedToAccount != null);
	}

	@NotNull
	public ContactMechanism getAddressedTo() {
		return addressedTo;
	}

	@NotNull
	public Party getBilledFrom() {
		return billedFrom;
	}

	@ManyToOne
	public BillingAccount getBilledToAccount() {
		return billedToAccount;
	}

	@NotNull
	public Party getBilledToParty() {
		return billedToParty;
	}

	@OneToMany
	public List<InvoiceItem> getComposedOf() {
		return composedOf;
	}

	@Lob
	public String getDescription() {
		return description;
	}

	@NotNull
	public Date getInvoiceDate() {
		return invoiceDate;
	}

	@OneToMany
	public List<InvoiceRole> getInvolving() {
		return involving;
	}

	@Lob
	public String getMessage() {
		return message;
	}

	@NotNull
	public ContactMechanism getSentFrom() {
		return sentFrom;
	}

	@OneToMany
	public List<InvoiceTerm> getTerms() {
		return terms;
	}

	public void setAddressedTo(ContactMechanism addressedTo) {
		this.addressedTo = addressedTo;
	}

	public void setBilledFrom(Party billedFrom) {
		this.billedFrom = billedFrom;
	}

	public void setBilledToAccount(BillingAccount billedToAccount) {
		this.billedToAccount = billedToAccount;
	}

	public void setBilledToParty(Party billedTo) {
		this.billedToParty = billedTo;
	}

	public void setComposedOf(List<InvoiceItem> composedOf) {
		this.composedOf = composedOf;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public void setInvolving(List<InvoiceRole> involving) {
		this.involving = involving;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setSentFrom(ContactMechanism sentFrom) {
		this.sentFrom = sentFrom;
	}

	public void setTerms(List<InvoiceTerm> terms) {
		this.terms = terms;
	}

//	public SalesAccountingTransaction getPostedVia() {
//		return postedVia;
//	}
//
//	public void setPostedVia(SalesAccountingTransaction postedVia) {
//		this.postedVia = postedVia;
//	}
}
