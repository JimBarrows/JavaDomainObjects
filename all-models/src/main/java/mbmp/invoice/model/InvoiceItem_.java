package mbmp.invoice.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.invoice.model.billing.OrderItemBilling;
import mbmp.invoice.model.billing.WorkEffortBilling;
import mbmp.invoice.model.term.InvoiceTerm;
import mbmp.model.BasePersistentModel_;
import mbmp.product.model.Product;
import mbmp.product.model.feature.ProductFeature;
import mbmp.product.model.storage.SerializedInventoryItem;
import mbmp.shipment.model.ShipmentItem;
import mbmp.workeffort.timetracking.TimeEntry;

@Generated(value="Dali", date="2013-01-04T22:11:20.492-0700")
@StaticMetamodel(InvoiceItem.class)
public class InvoiceItem_ extends BasePersistentModel_ {
	public static volatile ListAttribute<InvoiceItem, ShipmentItem> billingForShipmentItem;
	public static volatile ListAttribute<InvoiceItem, InvoiceItem> adjustments;
	public static volatile SingularAttribute<InvoiceItem, BigDecimal> amount;
	public static volatile ListAttribute<InvoiceItem, OrderItemBilling> billingForOrderItem;
	public static volatile ListAttribute<InvoiceItem, TimeEntry> billingForTimeEntry;
	public static volatile ListAttribute<InvoiceItem, WorkEffortBilling> billingForWorkEffort;
	public static volatile SingularAttribute<InvoiceItem, ProductFeature> chargeforFeature;
	public static volatile SingularAttribute<InvoiceItem, SerializedInventoryItem> chargeForItem;
	public static volatile SingularAttribute<InvoiceItem, Product> chargeForProduct;
	public static volatile SingularAttribute<InvoiceItem, String> description;
	public static volatile SingularAttribute<InvoiceItem, Integer> quantity;
	public static volatile SingularAttribute<InvoiceItem, Integer> sequence;
	public static volatile ListAttribute<InvoiceItem, InvoiceItem> soldWith;
	public static volatile ListAttribute<InvoiceItem, InvoiceTerm> terms;
	public static volatile SingularAttribute<InvoiceItem, InvoiceItemType> type;
	public static volatile SingularAttribute<InvoiceItem, Boolean> taxable;
}
