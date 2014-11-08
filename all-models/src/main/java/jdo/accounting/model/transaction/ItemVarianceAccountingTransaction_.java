package jdo.accounting.model.transaction;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.product.model.storage.InventoryItemVariance;

@Generated(value="Dali", date="2014-11-07T22:13:42.021-0700")
@StaticMetamodel(ItemVarianceAccountingTransaction.class)
public class ItemVarianceAccountingTransaction_ extends InternalAccountingTransaction_ {
	public static volatile SingularAttribute<ItemVarianceAccountingTransaction, InventoryItemVariance> originatedFrom;
}
