package jdo.product.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.product.model.identificationCode.GoodIdentification;
import jdo.product.model.storage.InventoryItem;
import jdo.product.model.supplier.SupplierProduct;

@Generated(value="Dali", date="2015-01-12T06:58:09.487-0700")
@StaticMetamodel(Good.class)
public class Good_ extends Product_ {
	public static volatile ListAttribute<Good, InventoryItem> genericDescriptionFor;
	public static volatile ListAttribute<Good, GoodIdentification> identifiedBy;
	public static volatile ListAttribute<Good, SupplierProduct> suppliedThru;
}
