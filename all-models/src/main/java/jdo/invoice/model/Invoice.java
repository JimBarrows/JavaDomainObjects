package jdo.invoice.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

import jdo.accounting.model.transaction.SalesAccountingTransaction;
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
	private static final long	serialVersionUID	= 1L;

	@NotNull
	@ManyToOne
	private ContactMechanism	addressedTo;

	@NotNull
	@ManyToOne
	private Party				billedFrom;

	@ManyToOne
	private BillingAccount		billedToAccount;

	@NotNull
	@ManyToOne
	private Party				billedToParty;

	@OneToMany
	private List<InvoiceItem>	composedOf;

	@Lob
	private String				description;

	@NotNull
	@Temporal(TemporalType.DATE)
	private Date				invoiceDate;
	
	@OneToMany
	private List<InvoiceRole>	involving;

	@Lob
	private String				message;

	@NotNull
	@ManyToOne
	private ContactMechanism	sentFrom;

	@OneToMany
	private List<InvoiceTerm>	terms;

	 @OneToOne
	 private SalesAccountingTransaction postedVia;

	@AssertTrue
	public boolean billedToPartyXorAccount() {
		return (billedToParty != null) ^ (billedToAccount != null);
	}


	public ContactMechanism getAddressedTo() {
		return addressedTo;
	}
	
	public Party getBilledFrom() {
		return billedFrom;
	}
	
	public BillingAccount getBilledToAccount() {
		return billedToAccount;
	}
	
	public Party getBilledToParty() {
		return billedToParty;
	}

	public List<InvoiceItem> getComposedOf() {
		return composedOf;
	}

	public String getDescription() {
		return description;
	}
	
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	
	public List<InvoiceRole> getInvolving() {
		return involving;
	}

	public String getMessage() {
		return message;
	}
	
	public ContactMechanism getSentFrom() {
		return sentFrom;
	}

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

	 public SalesAccountingTransaction getPostedVia() {
	 return postedVia;
	 }
	
	 public void setPostedVia(SalesAccountingTransaction postedVia) {
	 this.postedVia = postedVia;
	 }
}
