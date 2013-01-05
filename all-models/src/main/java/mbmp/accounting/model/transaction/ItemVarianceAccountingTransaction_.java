package mbmp.accounting.model.transaction;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.product.model.storage.InventoryItemVariance;

@Generated(value="Dali", date="2013-01-04T22:11:19.994-0700")
@StaticMetamodel(ItemVarianceAccountingTransaction.class)
public class ItemVarianceAccountingTransaction_ extends InternalAccountingTransaction_ {
	public static volatile SingularAttribute<ItemVarianceAccountingTransaction, InventoryItemVariance> originatedFrom;
}
