package jdo.invoice.model.payment;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.fields.Money;
import jdo.model.BasePersistentModel;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Payment extends BasePersistentModel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Embedded
	private Money amount;

	@Lob
	private String comment;

	@Temporal(TemporalType.DATE)
	private Date effectiveDate;

	@ManyToOne
	private PaymentMethodType paidVia;

	private String paymentReferenceNumber;

	@OneToMany
	private List<PaymentApplication> usedToPay;

	/**
	 * UUID of PaymentBudgetAllocation.
	 * 
	 */
	@ElementCollection
	private List<UUID> bookedAgainst;

	/**
	 * UUID of PaymentAccountingTransaction.
	 * 
	 */
	private UUID postedVia;

	public List<UUID> getBookedAgainst() {
		return bookedAgainst;
	}

	public void setBookedAgainst(List<UUID> bookedAgainst) {
		this.bookedAgainst = bookedAgainst;
	}

	public UUID getPostedVia() {
		return postedVia;
	}

	public void setPostedVia(UUID postedVia) {
		this.postedVia = postedVia;
	}

	public Money getAmount() {
		return amount;
	}

	public String getComment() {
		return comment;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public PaymentMethodType getPaidVia() {
		return paidVia;
	}

	public String getPaymentReferenceNumber() {
		return paymentReferenceNumber;
	}

	public List<PaymentApplication> getUsedToPay() {
		return usedToPay;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public void setPaidVia(PaymentMethodType paidVia) {
		this.paidVia = paidVia;
	}

	public void setPaymentReferenceNumber(String paymentReferenceNumber) {
		this.paymentReferenceNumber = paymentReferenceNumber;
	}

	public void setUsedToPay(List<PaymentApplication> usedToPay) {
		this.usedToPay = usedToPay;
	}
}
