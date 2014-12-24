package jdo.shipment.model.issuance;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.product.model.storage.InventoryItem;
import jdo.shipment.model.ShipmentItem;

@Generated(value="Dali", date="2014-12-24T16:23:57.683-0700")
@StaticMetamodel(ItemIssuance.class)
public class ItemIssuance_ {
	public static volatile SingularAttribute<ItemIssuance, PicklistItem> issuedAccordingTo;
	public static volatile SingularAttribute<ItemIssuance, ShipmentItem> issuedFor;
	public static volatile SingularAttribute<ItemIssuance, InventoryItem> issuedFrom;
	public static volatile SingularAttribute<ItemIssuance, Date> issuedOn;
	public static volatile SingularAttribute<ItemIssuance, Integer> quantity;
}
