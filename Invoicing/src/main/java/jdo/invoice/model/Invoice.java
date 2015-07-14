package jdo.invoice.model;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

import jdo.invoice.model.billingaccount.BillingAccount;
import jdo.invoice.model.term.InvoiceTerm;
import jdo.model.BasePersistentModel;

@Entity
public class Invoice extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID of ContactMechanism.
	 * 
	 */
	@NotNull
	private UUID addressedTo;

	/**
	 * UUID of Party.
	 * 
	 */
	@NotNull
	private UUID billedFrom;

	@ManyToOne
	private BillingAccount billedToAccount;

	/**
	 * UUID of Party.
	 * 
	 */
	@NotNull
	private UUID billedToParty;

	@OneToMany
	private List<InvoiceItem> composedOf;

	@Lob
	private String description;

	@NotNull
	@Temporal(TemporalType.DATE)
	private Date invoiceDate;

	@OneToMany
	private List<InvoiceRole> involving;

	@Lob
	private String message;

	/**
	 * UUID of ContactMechanism.
	 * 
	 */
	@NotNull
	private UUID sentFrom;

	@OneToMany
	private List<InvoiceTerm> terms;

	/**
	 * UUID of the SalesAccountingTransaction.
	 * 
	 */
	private UUID postedVia;

	@AssertTrue
	public boolean billedToPartyXorAccount() {
		return (billedToParty != null) ^ (billedToAccount != null);
	}

	public UUID getAddressedTo() {
		return addressedTo;
	}

	public UUID getBilledFrom() {
		return billedFrom;
	}

	public BillingAccount getBilledToAccount() {
		return billedToAccount;
	}

	public UUID getBilledToParty() {
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

	public UUID getSentFrom() {
		return sentFrom;
	}

	public List<InvoiceTerm> getTerms() {
		return terms;
	}

	public void setAddressedTo(UUID addressedTo) {
		this.addressedTo = addressedTo;
	}

	public void setBilledFrom(UUID billedFrom) {
		this.billedFrom = billedFrom;
	}

	public void setBilledToAccount(BillingAccount billedToAccount) {
		this.billedToAccount = billedToAccount;
	}

	public void setBilledToParty(UUID billedTo) {
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

	public void setSentFrom(UUID sentFrom) {
		this.sentFrom = sentFrom;
	}

	public void setTerms(List<InvoiceTerm> terms) {
		this.terms = terms;
	}

	public UUID getPostedVia() {
		return postedVia;
	}

	public void setPostedVia(UUID postedVia) {
		this.postedVia = postedVia;
	}
}
