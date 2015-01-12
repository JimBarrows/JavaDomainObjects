package jdo.shipment.model.issuance;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.product.model.storage.InventoryItem;
import jdo.shipment.model.ShipmentItem;

@Generated(value="Dali", date="2015-01-12T06:51:48.171-0700")
@StaticMetamodel(ItemIssuance.class)
public class ItemIssuance_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ItemIssuance, PicklistItem> issuedAccordingTo;
	public static volatile SingularAttribute<ItemIssuance, ShipmentItem> issuedFor;
	public static volatile SingularAttribute<ItemIssuance, InventoryItem> issuedFrom;
	public static volatile SingularAttribute<ItemIssuance, Date> issuedOn;
	public static volatile SingularAttribute<ItemIssuance, Integer> quantity;
}
