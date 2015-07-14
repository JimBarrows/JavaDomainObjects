package jdo.accounting.model.transaction;

import java.util.UUID;

import javax.persistence.Entity;

@Entity
public class ExternalAccountingTransaction extends AccountingTransaction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID of Party.
	 * 
	 */
	private UUID partyFrom;

	/**
	 * UUID of Party.
	 * 
	 */
	private UUID partyTo;

	public UUID getPartyFrom() {
		return partyFrom;
	}

	public UUID getPartyTo() {
		return partyTo;
	}

	public void setPartyFrom(UUID partyFrom) {
		this.partyFrom = partyFrom;
	}

	public void setPartyTo(UUID partyTo) {
		this.partyTo = partyTo;
	}

}
