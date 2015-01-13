package jdo.accounting.model.transaction;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.party.model.PartyRole;

@Entity
public class InternalAccountingTransaction extends AccountingTransaction {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private PartyRole			transactionFrom;

	public PartyRole getTransactionFrom() {
		return transactionFrom;
	}

	public void setTransactionFrom(PartyRole transactionFrom) {
		this.transactionFrom = transactionFrom;
	}
}
