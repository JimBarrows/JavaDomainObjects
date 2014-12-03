package jdo.order.model.adjustment;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import jdo.fields.Money;
import jdo.order.model.Order;
import jdo.order.model.OrderItem;

@Entity
public class OrderAdjustment extends jdo.model.BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private OrderItem			affectingItem;

	private Order				affectingOrder;

	private Money				amount;

	private int					percentage;

	private OrderAdjustmentType	type;

	@ManyToOne
	public OrderItem getAffectingItem() {
		return affectingItem;
	}

	@ManyToOne
	public Order getAffectingOrder() {
		return affectingOrder;
	}

	@Embedded
	public Money getAmount() {
		return amount;
	}

	@Min(0)
	@Max(100)
	public int getPercentage() {
		return percentage;
	}

	@NotNull
	public OrderAdjustmentType getType() {
		return type;
	}

	@AssertTrue
	public boolean onlyOrderOrItemSet() {
		return (((affectingItem != null) && (affectingOrder == null)) || ((affectingItem == null) && (affectingOrder != null)));
	}

	public void setAffectingItem(OrderItem affectingItem) {
		this.affectingItem = affectingItem;
	}

	public void setAffectingOrder(Order affectingOrder) {
		this.affectingOrder = affectingOrder;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public void setType(OrderAdjustmentType type) {
		this.type = type;
	}
}
