package com.nsfwenterprises.biz360.order.model.adjustment;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.validator.AssertTrue;
import org.hibernate.validator.Max;
import org.hibernate.validator.Min;
import org.hibernate.validator.NotNull;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.order.model.Order;
import com.nsfwenterprises.biz360.order.model.OrderItem;

@Entity
public class OrderAdjustment extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private OrderItem affectingItem;

	private Order affectingOrder;

	private BigDecimal amount;

	private int percentage;
	
	private OrderAdjustmentType type;

	@ManyToOne
	public OrderItem getAffectingItem() {
		return affectingItem;
	}

	@ManyToOne
	public Order getAffectingOrder() {
		return affectingOrder;
	}

	public BigDecimal getAmount() {
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

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public void setType(OrderAdjustmentType type) {
		this.type = type;
	}
}