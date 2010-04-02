package com.nsfwenterprises.accounting_invoice.accounting.model.transaction;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.nsfwenterprises.biz360.accounting.model.transaction.ObligationAccountingTransaction;
import com.nsfwenterprises.biz360.invoice.model.Invoice;

@Entity
public class SalesAccountingTransaction extends ObligationAccountingTransaction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne
	private Invoice orignatedFrom;

	public Invoice getOrignatedFrom() {
		return orignatedFrom;
	}

	public void setOrignatedFrom(Invoice orignatedFrom) {
		this.orignatedFrom = orignatedFrom;
	}
}
