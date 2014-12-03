package jdo.invoice.model.billing;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import jdo.fields.Money;
import jdo.invoice.model.InvoiceItem;
import jdo.model.BasePersistentModel;
import jdo.order.model.OrderItem;

@Entity
public class OrderItemBilling extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private Money				amount;

	private InvoiceItem			billingFor;

	private int					quantity;

	private OrderItem			quantityOf;

	@Embedded
	public Money getAmount() {
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

	public void setAmount(Money amount) {
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
