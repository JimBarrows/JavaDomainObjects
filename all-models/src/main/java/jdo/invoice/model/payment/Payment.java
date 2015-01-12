package jdo.invoice.model.payment;

import java.util.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import jdo.accounting.model.transaction.PaymentAccountingTransaction;
import jdo.budget.model.PaymentBudgetAllocation;
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

	private Date effectiveDate;

	@ManyToOne
	private PaymentMethodType paidVia;

	private String paymentRefNum;

	@OneToMany
	private List<PaymentApplication> usedToPay;

	@OneToMany
	private List<PaymentBudgetAllocation> bookedAgainst;

	@OneToOne
	private PaymentAccountingTransaction postedVia;

	public List<PaymentBudgetAllocation> getBookedAgainst() {
		return bookedAgainst;
	}

	public void setBookedAgainst(List<PaymentBudgetAllocation> bookedAgainst) {
		this.bookedAgainst = bookedAgainst;
	}

	public PaymentAccountingTransaction getPostedVia() {
		return postedVia;
	}

	public void setPostedVia(PaymentAccountingTransaction postedVia) {
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

	public String getPaymentRefNum() {
		return paymentRefNum;
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

	public void setPaymentRefNum(String paymentRefNum) {
		this.paymentRefNum = paymentRefNum;
	}

	public void setUsedToPay(List<PaymentApplication> usedToPay) {
		this.usedToPay = usedToPay;
	}
}
