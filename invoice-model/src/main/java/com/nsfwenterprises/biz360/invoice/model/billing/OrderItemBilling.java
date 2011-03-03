package com.nsfwenterprises.biz360.invoice.model.billing;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.nsfwenterprises.biz360.invoice.model.InvoiceItem;
import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.order.model.OrderItem;

@Entity
public class OrderItemBilling extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigDecimal amount;
	
	private InvoiceItem billingFor;
	
	private int quantity;
	
	private OrderItem quantityOf;

	public BigDecimal getAmount() {
		return amount;
	}

	@ManyToOne
	@NotNull
	public InvoiceItem getBillingFor() {
		return billingFor;
	}

	@Min(0)
	public int getQuantity() {
		return quantity;
	}

	@NotNull
	@ManyToOne
	public OrderItem getQuantityOf() {
		return quantityOf;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setBillingFor(InvoiceItem billingFor) {
		this.billingFor = billingFor;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setQuantityOf(OrderItem quantityOf) {
		this.quantityOf = quantityOf;
	}

}
