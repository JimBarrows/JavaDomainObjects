package jdo.accounting.model.transaction;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class InternalAccountingTransaction extends AccountingTransaction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID for PartyRole.
	 * 
	 */
	private UUID transactionFrom;

	public UUID getTransactionFrom() {
		return transactionFrom;
	}

	public void setTransactionFrom(UUID transactionFrom) {
		this.transactionFrom = transactionFrom;
	}
}
