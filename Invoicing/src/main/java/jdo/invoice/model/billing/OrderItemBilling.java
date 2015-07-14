package jdo.invoice.model.billing;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import jdo.fields.Money;
import jdo.invoice.model.InvoiceItem;
import jdo.model.BasePersistentModel;

@Entity
public class OrderItemBilling extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Embedded
	private Money amount;

	@ManyToOne
	@NotNull
	private InvoiceItem billingFor;

	@Min(0)
	private int quantity;

	/**
	 * UUID of OrderItem.
	 * 
	 */
	@NotNull
	private UUID quantityOf;

	public Money getAmount() {
		return amount;
	}

	public InvoiceItem getBillingFor() {
		return billingFor;
	}

	public int getQuantity() {
		return quantity;
	}

	public UUID getQuantityOf() {
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

	public void setQuantityOf(UUID quantityOf) {
		this.quantityOf = quantityOf;
	}

}
