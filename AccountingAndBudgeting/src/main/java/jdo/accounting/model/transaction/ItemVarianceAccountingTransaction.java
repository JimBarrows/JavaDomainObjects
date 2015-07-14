package jdo.accounting.model.transaction;

import java.util.UUID;

import javax.persistence.Entity;

@Entity
public class ItemVarianceAccountingTransaction extends InternalAccountingTransaction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID for InventoryItemVariance.
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
