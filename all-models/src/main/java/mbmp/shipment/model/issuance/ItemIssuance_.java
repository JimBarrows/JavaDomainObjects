package mbmp.shipment.model.issuance;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.product.model.storage.InventoryItem;
import mbmp.shipment.model.ShipmentItem;

@Generated(value="Dali", date="2013-01-04T22:11:23.253-0700")
@StaticMetamodel(ItemIssuance.class)
public class ItemIssuance_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ItemIssuance, PicklistItem> issuedAccordingTo;
	public static volatile SingularAttribute<ItemIssuance, ShipmentItem> issuedFor;
	public static volatile SingularAttribute<ItemIssuance, InventoryItem> issuedFrom;
	public static volatile SingularAttribute<ItemIssuance, Date> issuedOn;
	public static volatile SingularAttribute<ItemIssuance, Integer> quantity;
}
