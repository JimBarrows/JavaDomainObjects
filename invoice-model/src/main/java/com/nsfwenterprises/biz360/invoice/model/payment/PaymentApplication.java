package com.nsfwenterprises.biz360.invoice.model.payment;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.invoice.model.InvoiceItem;
import com.nsfwenterprises.biz360.invoice.model.billingaccount.BillingAccount;
import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class PaymentApplication extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigDecimal amountApplied;
	
	private BillingAccount appliedToAccount;
	
	private InvoiceItem appliedToItem;

	public BigDecimal getAmountApplied() {
		return amountApplied;
	}

	@ManyToOne
	public BillingAccount getAppliedToAccount() {
		return appliedToAccount;
	}

	@ManyToOne
	public InvoiceItem getAppliedToItem() {
		return appliedToItem;
	}

	public void setAmountApplied(BigDecimal amountApplied) {
		this.amountApplied = amountApplied;
	}

	public void setAppliedToAccount(BillingAccount appliedToAccount) {
		this.appliedToAccount = appliedToAccount;
	}

	public void setAppliedToItem(InvoiceItem appliedToItem) {
		this.appliedToItem = appliedToItem;
	}

}
