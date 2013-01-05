package mbmp.shipment.model.issuance;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.product.model.storage.InventoryItem;

@Generated(value="Dali", date="2013-01-04T22:11:23.326-0700")
@StaticMetamodel(PicklistItem.class)
public class PicklistItem_ extends BasePersistentModel_ {
	public static volatile ListAttribute<PicklistItem, ItemIssuance> issueList;
	public static volatile SingularAttribute<PicklistItem, PickList> partOf;
	public static volatile SingularAttribute<PicklistItem, InventoryItem> pickedFrom;
	public static volatile SingularAttribute<PicklistItem, Integer> quantity;
}
