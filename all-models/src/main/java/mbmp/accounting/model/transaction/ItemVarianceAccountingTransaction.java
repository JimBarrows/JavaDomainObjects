package mbmp.accounting.model.transaction;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import mbmp.product.model.storage.InventoryItemVariance;

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
