package mbmp.product.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.product.model.identificationCode.GoodIdentification;
import mbmp.product.model.storage.InventoryItem;
import mbmp.product.model.supplier.SupplierProduct;

@Generated(value="Dali", date="2013-01-04T22:11:22.673-0700")
@StaticMetamodel(Good.class)
public class Good_ extends Product_ {
	public static volatile ListAttribute<Good, InventoryItem> genericDescriptionFor;
	public static volatile ListAttribute<Good, GoodIdentification> identifiedBy;
	public static volatile ListAttribute<Good, SupplierProduct> suppliedThru;
}
