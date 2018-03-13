package jdo.invoice.model.payment;

import jdo.fields.Money;
import jdo.invoice.model.InvoiceItem;
import jdo.invoice.model.billingaccount.BillingAccount;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PaymentApplication extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Embedded
	private Money amountApplied;

	@ManyToOne
	private BillingAccount appliedToAccount;

	@ManyToOne
	private InvoiceItem appliedToItem;

	public Money getAmountApplied() {
		return amountApplied;
	}

	public BillingAccount getAppliedToAccount() {
		return appliedToAccount;
	}

	public InvoiceItem getAppliedToItem() {
		return appliedToItem;
	}

	public void setAmountApplied(Money amountApplied) {
		this.amountApplied = amountApplied;
	}

	public void setAppliedToAccount(BillingAccount appliedToAccount) {
		this.appliedToAccount = appliedToAccount;
	}

	public void setAppliedToItem(InvoiceItem appliedToItem) {
		this.appliedToItem = appliedToItem;
	}

}
