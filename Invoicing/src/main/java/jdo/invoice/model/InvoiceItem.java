package jdo.invoice.model;

import jdo.fields.Money;
import jdo.invoice.model.billing.OrderItemBilling;
import jdo.invoice.model.billing.WorkEffortBilling;
import jdo.invoice.model.term.InvoiceTerm;
import jdo.model.PersistentEntity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.List;
import java.util.UUID;

@Entity
public class InvoiceItem extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToMany
	private List<InvoiceItem> adjustments;

	@Embedded
	private Money amount;

	@OneToMany
	private List<OrderItemBilling> billingForOrderItem;

	/**
	 * UUID for TimeEntry.
	 * 
	 */
	@ElementCollection
	private List<UUID> billingForTimeEntry;

	@OneToMany
	private List<WorkEffortBilling> billingForWorkEffort;

	/**
	 * UUID for ProductFeature.
	 * 
	 */
	private UUID chargeforFeature;

	/**
	 * UUID for SerializedInventoryItem.
	 * 
	 */
	private UUID chargeForItem;

	/**
	 * UUID for Product.
	 * 
	 */
	private UUID chargeForProduct;

	@Lob
	private String description;

	@Min(0)
	private int quantity;

	@Min(0)
	private int sequence;

	@OneToMany
	private List<InvoiceItem> soldWith;

	private boolean taxable;

	@OneToMany
	private List<InvoiceTerm> terms;

	@ManyToOne
	private InvoiceItemType type;

	/**
	 * UUID for ShipmentItem.
	 * 
	 */
	@ElementCollection
	private List<UUID> billingForShipmentItem;

	public List<UUID> getBillingForShipmentItem() {
		return billingForShipmentItem;
	}

	public void setBillingForShipmentItem(List<UUID> billingFor) {
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

	public List<UUID> getBillingForTimeEntry() {
		return billingForTimeEntry;
	}

	public List<WorkEffortBilling> getBillingForWorkEffort() {
		return billingForWorkEffort;
	}

	public UUID getChargeforFeature() {
		return chargeforFeature;
	}

	public UUID getChargeForItem() {
		return chargeForItem;
	}

	public UUID getChargeForProduct() {
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

	public void setBillingForTimeEntry(List<UUID> billingForTimeEntry) {
		this.billingForTimeEntry = billingForTimeEntry;
	}

	public void setBillingForWorkEffort(List<WorkEffortBilling> billingForWorkEffort) {
		this.billingForWorkEffort = billingForWorkEffort;
	}

	public void setChargeforFeature(UUID chargeforFeature) {
		this.chargeforFeature = chargeforFeature;
	}

	public void setChargeForItem(UUID chargeForItem) {
		this.chargeForItem = chargeForItem;
	}

	public void setChargeForProduct(UUID chageForProduct) {
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
