package jdo.accounting.model.transaction;

import java.util.UUID;

import javax.persistence.Entity;

@Entity
public class PaymentAccountingTransaction extends ExternalAccountingTransaction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID for Payment.
	 * 
	 */
	private UUID originatedFrom;

	public UUID getOriginatedFrom() {
		return originatedFrom;
	}

	public void setOriginatedFrom(UUID originatedFrom) {
		this.originatedFrom = originatedFrom;
	}

}
