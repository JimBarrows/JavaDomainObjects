package jdo.order.model.adjustment;

import jdo.fields.Money;
import jdo.model.PersistentEntity;
import jdo.order.model.Order;
import jdo.order.model.OrderItem;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class OrderAdjustment extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private OrderItem affectingItem;

	@ManyToOne
	private Order affectingOrder;

	@Embedded
	private Money amount;

	@Min(0)
	@Max(100)
	private int percentage;

	@ManyToOne
	private OrderAdjustmentType type;

	public OrderItem getAffectingItem() {
		return affectingItem;
	}

	public Order getAffectingOrder() {
		return affectingOrder;
	}

	public Money getAmount() {
		return amount;
	}

	public int getPercentage() {
		return percentage;
	}

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
