package jdo.shipment.model.issuance;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.product.model.storage.InventoryItem;

@Generated(value="Dali", date="2014-12-02T21:45:38.655-0700")
@StaticMetamodel(PicklistItem.class)
public class PicklistItem_ extends BasePersistentModel_ {
	public static volatile ListAttribute<PicklistItem, ItemIssuance> issueList;
	public static volatile SingularAttribute<PicklistItem, PickList> partOf;
	public static volatile SingularAttribute<PicklistItem, InventoryItem> pickedFrom;
	public static volatile SingularAttribute<PicklistItem, Integer> quantity;
}
