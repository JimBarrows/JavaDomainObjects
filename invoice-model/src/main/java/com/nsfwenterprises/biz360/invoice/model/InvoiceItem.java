package com.nsfwenterprises.biz360.invoice.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.Min;

import com.nsfwenterprises.biz360.invoice.model.billing.OrderItemBilling;
import com.nsfwenterprises.biz360.invoice.model.billing.WorkEffortBilling;
import com.nsfwenterprises.biz360.invoice.model.term.InvoiceTerm;
import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.product.model.Product;
import com.nsfwenterprises.biz360.product.model.feature.ProductFeature;
import com.nsfwenterprises.biz360.product.model.storage.SerializedInventoryItem;
import com.nsfwenterprises.biz360.workeffort.timetracking.TimeEntry;

@Entity
public class InvoiceItem extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<InvoiceItem> adjustments;
	
	private BigDecimal amount;
	
	private List<OrderItemBilling> billingForOrderItem;
	

	
	private List<TimeEntry> billingForTimeEntry;
	
	private List<WorkEffortBilling> billingForWorkEffort;
	
	private ProductFeature chargeforFeature;
	
	private SerializedInventoryItem chargeForItem;
	
	private Product chargeForProduct;
	
	private String description;
	
	private int quantity;
	
	private int sequence;
	
	private List<InvoiceItem> soldWith;
	
	private boolean taxable;
	
	private List<InvoiceTerm> terms;
	
	private InvoiceItemType type;

	@OneToMany
	public List<InvoiceItem> getAdjustments() {
		return adjustments;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	@OneToMany
	public List<OrderItemBilling> getBillingForOrderItem() {
		return billingForOrderItem;
	}

	@OneToMany
	public List<TimeEntry> getBillingForTimeEntry() {
		return billingForTimeEntry;
	}

	@OneToMany
	public List<WorkEffortBilling> getBillingForWorkEffort() {
		return billingForWorkEffort;
	}

	@ManyToOne
	public ProductFeature getChargeforFeature() {
		return chargeforFeature;
	}

	@ManyToOne
	public SerializedInventoryItem getChargeForItem() {
		return chargeForItem;
	}
	
	@ManyToOne
	public Product getChargeForProduct() {
		return chargeForProduct;
	}

	@Lob
	public String getDescription() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}

	@Min(0)
	public int getSequence() {
		return sequence;
	}

	@OneToMany
	public List<InvoiceItem> getSoldWith() {
		return soldWith;
	}

	@OneToMany
	public List<InvoiceTerm> getTerms() {
		return terms;
	}

	@ManyToOne
	public InvoiceItemType getType() {
		return type;
	}

	public boolean isTaxable() {
		return taxable;
	}

	public void setAdjustments(List<InvoiceItem> adjustments) {
		this.adjustments = adjustments;
	}

	public void setAmount(BigDecimal amount) {
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
