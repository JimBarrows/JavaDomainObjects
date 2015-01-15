package jdo.order.model.terms;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

import jdo.fields.Money;
import jdo.model.BasePersistentModel;
import jdo.order.model.Order;
import jdo.order.model.OrderItem;

@Entity
public class OrderTerm extends BasePersistentModel {

	private static final long serialVersionUID = 1L;
	@ManyToOne
	private OrderItem conditionForItem;
	@ManyToOne
	private Order conditionForOrder;
	@NotNull
	@ManyToOne
	private OrderTermType describedBy;
	@Embedded
	private Money value;

	@AssertTrue
	public boolean onlyOrderOrItemSet() {
		return (((conditionForItem == null) && (conditionForOrder != null)) || ((conditionForItem != null) && (conditionForOrder == null)));
	}

	public OrderItem getConditionForItem() {
		return conditionForItem;
	}

	public Order getConditionForOrder() {
		return conditionForOrder;
	}

	public OrderTermType getDescribedBy() {
		return describedBy;
	}

	public Money getValue() {
		return value;
	}

	public void setConditionForItem(OrderItem conditionForItem) {
		this.conditionForItem = conditionForItem;
	}

	public void setConditionForOrder(Order conditionForOrder) {
		this.conditionForOrder = conditionForOrder;
	}

	public void setDescribedBy(OrderTermType describedBy) {
		this.describedBy = describedBy;
	}

	public void setValue(Money value) {
		this.value = value;
	}
}
