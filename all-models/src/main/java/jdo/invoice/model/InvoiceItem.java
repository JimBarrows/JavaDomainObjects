package jdo.invoice.model;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;

import jdo.fields.Money;
import jdo.invoice.model.billing.OrderItemBilling;
import jdo.invoice.model.billing.WorkEffortBilling;
import jdo.invoice.model.term.InvoiceTerm;
import jdo.model.BasePersistentModel;
import jdo.product.model.Product;
import jdo.product.model.feature.ProductFeature;
import jdo.product.model.storage.SerializedInventoryItem;
import jdo.shipment.model.ShipmentItem;
import jdo.workeffort.timetracking.TimeEntry;

@Entity
public class InvoiceItem extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long				serialVersionUID	= 1L;

	@OneToMany
	private List<InvoiceItem>				adjustments;

	@Embedded
	private Money										amount;

	@OneToMany
	private List<OrderItemBilling>	billingForOrderItem;

	@OneToMany
	private List<TimeEntry>					billingForTimeEntry;

	@OneToMany
	private List<WorkEffortBilling>	billingForWorkEffort;

	private ProductFeature					chargeforFeature;

	@ManyToOne
	private SerializedInventoryItem	chargeForItem;

	@ManyToOne
	private Product									chargeForProduct;

	@Lob
	private String									description;

	private int											quantity;

	@Min(0)
	private int											sequence;

	private List<InvoiceItem>				soldWith;

	private boolean									taxable;

	@OneToMany
	private List<InvoiceTerm>				terms;

	private InvoiceItemType					type;

	@OneToMany
	private List<ShipmentItem>			billingForShipmentItem;

	public List<ShipmentItem> getBillingForShipmentItem() {
		return billingForShipmentItem;
	}

	public void setBillingForShipmentItem(List<ShipmentItem> billingFor) {
		this.billingForShipmentItem = billingFor;
	}

	public List<InvoiceItem> getAdjustments() {
		return adjustments;
	}

	public Money getAmount() {
		return amount;
	}

	public List<OrderItemBilling> getBillingForOrderItem() {
		return billingForOrderItem;
	}

	public List<TimeEntry> getBillingForTimeEntry() {
		return billingForTimeEntry;
	}

	public List<WorkEffortBilling> getBillingForWorkEffort() {
		return billingForWorkEffort;
	}

	public ProductFeature getChargeforFeature() {
		return chargeforFeature;
	}

	public SerializedInventoryItem getChargeForItem() {
		return chargeForItem;
	}

	public Product getChargeForProduct() {
		return chargeForProduct;
	}

	public String getDescription() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getSequence() {
		return sequence;
	}

	public List<InvoiceItem> getSoldWith() {
		return soldWith;
	}

	public List<InvoiceTerm> getTerms() {
		return terms;
	}

	public InvoiceItemType getType() {
		return type;
	}

	public boolean isTaxable() {
		return taxable;
	}

	public void setAdjustments(List<InvoiceItem> adjustments) {
		this.adjustments = adjustments;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public void setBillingForOrderItem(List<OrderItemBilling> billingForOrderItem) {
		this.billingForOrderItem = billingForOrderItem;
	}

	public void setBillingForTimeEntry(List<TimeEntry> billingForTimeEntry) {
		this.billingForTimeEntry = billingForTimeEntry;
	}

	public void setBillingForWorkEffort(List<WorkEffortBilling> billingForWorkEffort) {
		this.billingForWorkEffort = billingForWorkEffort;
	}

	public void setChargeforFeature(ProductFeature chargeforFeature) {
		this.chargeforFeature = chargeforFeature;
	}

	public void setChargeForItem(SerializedInventoryItem chargeForItem) {
		this.chargeForItem = chargeForItem;
	}

	public void setChargeForProduct(Product chageForProduct) {
		this.chargeForProduct = chageForProduct;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public void setSoldWith(List<InvoiceItem> soldWith) {
		this.soldWith = soldWith;
	}

	public void setTaxable(boolean taxable) {
		this.taxable = taxable;
	}

	public void setTerms(List<InvoiceTerm> terms) {
		this.terms = terms;
	}

	public void setType(InvoiceItemType type) {
		this.type = type;
	}
}
