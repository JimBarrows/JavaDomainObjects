package jdo.accounting.model.transaction;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import jdo.invoice.model.Invoice;

@Entity
public class SalesAccountingTransaction extends ObligationAccountingTransaction {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@OneToOne
	private Invoice				orignatedFrom;

	public Invoice getOrignatedFrom() {
		return orignatedFrom;
	}

	public void setOrignatedFrom(Invoice orignatedFrom) {
		this.orignatedFrom = orignatedFrom;
	}
}
