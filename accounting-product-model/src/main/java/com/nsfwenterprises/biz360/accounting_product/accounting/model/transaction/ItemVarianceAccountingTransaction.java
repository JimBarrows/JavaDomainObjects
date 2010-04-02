package com.nsfwenterprises.biz360.accounting_product.accounting.model.transaction;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.nsfwenterprises.biz360.accounting.model.transaction.InternalAccountingTransaction;
import com.nsfwenterprises.biz360.product.model.storage.InventoryItemVariance;

@Entity
public class ItemVarianceAccountingTransaction extends InternalAccountingTransaction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	private InventoryItemVariance originatedFrom;

	@OneToOne
	public InventoryItemVariance getOriginatedFrom() {
		return originatedFrom;
	}

	public void setOriginatedFrom(InventoryItemVariance originatedFrom) {
		this.originatedFrom = originatedFrom;
	}

}
