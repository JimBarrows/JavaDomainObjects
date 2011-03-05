package com.nsfwenterprises.biz360.accounting.model.transaction;

import javax.persistence.Entity;

import com.nsfwenterprises.biz360.party.model.PartyRole;

@Entity
public class InternalAccountingTransaction extends AccountingTransaction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PartyRole transactionFrom;

	public PartyRole getTransactionFrom() {
		return transactionFrom;
	}

	public void setTransactionFrom(PartyRole transactionFrom) {
		this.transactionFrom = transactionFrom;
	}
}
