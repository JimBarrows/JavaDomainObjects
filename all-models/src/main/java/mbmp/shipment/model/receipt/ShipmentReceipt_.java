package mbmp.shipment.model.receipt;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.order.model.OrderItem;
import mbmp.product.model.Good;
import mbmp.product.model.storage.InventoryItem;

@Generated(value="Dali", date="2013-01-05T08:07:18.032-0700")
@StaticMetamodel(ShipmentReceipt.class)
public class ShipmentReceipt_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<ShipmentReceipt, Good> good;
	public static volatile SingularAttribute<ShipmentReceipt, InventoryItem> inventoryItem;
	public static volatile SingularAttribute<ShipmentReceipt, String> itemDescription;
	public static volatile SingularAttribute<ShipmentReceipt, OrderItem> orderItem;
	public static volatile SingularAttribute<ShipmentReceipt, Integer> quantityAccepted;
	public static volatile SingularAttribute<ShipmentReceipt, Integer> quantityRejected;
	public static volatile SingularAttribute<ShipmentReceipt, Date> received;
	public static volatile SingularAttribute<ShipmentReceipt, RejectionReason> rejectionReason;
	public static volatile ListAttribute<ShipmentReceipt, ShipmentReceiptRole> roles;
	public static volatile SingularAttribute<ShipmentReceipt, ShipmentPackage> shipmentPackage;
}
