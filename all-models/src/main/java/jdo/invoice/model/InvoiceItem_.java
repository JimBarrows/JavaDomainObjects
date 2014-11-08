package jdo.invoice.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.invoice.model.billing.OrderItemBilling;
import jdo.invoice.model.billing.WorkEffortBilling;
import jdo.invoice.model.term.InvoiceTerm;
import jdo.model.BasePersistentModel_;
import jdo.product.model.Product;
import jdo.product.model.feature.ProductFeature;
import jdo.product.model.storage.SerializedInventoryItem;
import jdo.shipment.model.ShipmentItem;
import jdo.workeffort.timetracking.TimeEntry;

@Generated(value="Dali", date="2014-11-07T22:13:42.559-0700")
@StaticMetamodel(InvoiceItem.class)
public class InvoiceItem_ extends BasePersistentModel_ {
	public static volatile ListAttribute<InvoiceItem, ShipmentItem> billingForShipmentItem;
	public static volatile ListAttribute<InvoiceItem, InvoiceItem> adjustments;
	public static volatile ListAttribute<InvoiceItem, OrderItemBilling> billingForOrderItem;
	public static volatile ListAttribute<InvoiceItem, TimeEntry> billingForTimeEntry;
	public static volatile ListAttribute<InvoiceItem, WorkEffortBilling> billingForWorkEffort;
	public static volatile SingularAttribute<InvoiceItem, ProductFeature> chargeforFeature;
	public static volatile SingularAttribute<InvoiceItem, SerializedInventoryItem> chargeForItem;
	public static volatile SingularAttribute<InvoiceItem, Product> chargeForProduct;
	public static volatile SingularAttribute<InvoiceItem, String> description;
	public static volatile ListAttribute<InvoiceItem, InvoiceItem> soldWith;
	public static volatile ListAttribute<InvoiceItem, InvoiceTerm> terms;
	public static volatile SingularAttribute<InvoiceItem, InvoiceItemType> type;
	public static volatile SingularAttribute<InvoiceItem, BigDecimal> amount;
	public static volatile SingularAttribute<InvoiceItem, Integer> quantity;
	public static volatile SingularAttribute<InvoiceItem, Integer> sequence;
	public static volatile SingularAttribute<InvoiceItem, Boolean> taxable;
}
