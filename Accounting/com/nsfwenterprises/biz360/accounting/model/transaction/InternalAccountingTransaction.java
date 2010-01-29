package com.nsfwenterprises.biz360.accounting.model.transaction;

import javax.persistence.Entity;

import com.nsfwenterprises.biz360.party.model.role.InternalOrganization;

@Entity
public class InternalAccountingTransaction extends AccountingTransaction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private InternalOrganization transactionFrom;

	public InternalOrganization getTransactionFrom() {
		return transactionFrom;
	}

	public void setTransactionFrom(InternalOrganization transactionFrom) {
		this.transactionFrom = transactionFrom;
	}
}
