package jdo.shipment.model.receipt;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.order.model.OrderItem;
import jdo.product.model.Good;
import jdo.product.model.storage.InventoryItem;

@Generated(value="Dali", date="2014-12-24T16:23:57.738-0700")
@StaticMetamodel(ShipmentReceipt.class)
public class ShipmentReceipt_ {
	public static volatile SingularAttribute<ShipmentReceipt, Good> good;
	public static volatile SingularAttribute<ShipmentReceipt, InventoryItem> inventoryItem;
	public static volatile SingularAttribute<ShipmentReceipt, String> itemDescription;
	public static volatile SingularAttribute<ShipmentReceipt, OrderItem> orderItem;
	public static volatile SingularAttribute<ShipmentReceipt, Date> received;
	public static volatile SingularAttribute<ShipmentReceipt, RejectionReason> rejectionReason;
	public static volatile ListAttribute<ShipmentReceipt, ShipmentReceiptRole> roles;
	public static volatile SingularAttribute<ShipmentReceipt, ShipmentPackage> shipmentPackage;
	public static volatile SingularAttribute<ShipmentReceipt, Integer> quantityAccepted;
	public static volatile SingularAttribute<ShipmentReceipt, Integer> quantityRejected;
}
