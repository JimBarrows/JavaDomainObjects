package jdo.accounting.model.transaction;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.product.model.storage.InventoryItemVariance;

@Generated(value="Dali", date="2014-12-02T21:45:36.760-0700")
@StaticMetamodel(ItemVarianceAccountingTransaction.class)
public class ItemVarianceAccountingTransaction_ extends InternalAccountingTransaction_ {
	public static volatile SingularAttribute<ItemVarianceAccountingTransaction, InventoryItemVariance> originatedFrom;
}
