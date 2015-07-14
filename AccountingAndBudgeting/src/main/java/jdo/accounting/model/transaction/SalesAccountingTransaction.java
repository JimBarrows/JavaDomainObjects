package jdo.accounting.model.transaction;

import java.util.UUID;

import javax.persistence.Entity;

@Entity
public class SalesAccountingTransaction extends ObligationAccountingTransaction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID for Invoice.
	 * 
	 */
	private UUID orignatedFrom;

	public UUID getOrignatedFrom() {
		return orignatedFrom;
	}

	public void setOrignatedFrom(UUID orignatedFrom) {
		this.orignatedFrom = orignatedFrom;
	}
}
