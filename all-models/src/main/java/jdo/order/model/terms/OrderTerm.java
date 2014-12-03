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

	private static final long	serialVersionUID	= 1L;

	private OrderItem			conditionForItem;

	private Order				conditionForOrder;

	private OrderTermType		describedBy;

	private Money				value;

	@ManyToOne
	public OrderItem getConditionForItem() {
		return conditionForItem;
	}

	@ManyToOne
	public Order getConditionForOrder() {
		return conditionForOrder;
	}

	@NotNull
	@ManyToOne
	public OrderTermType getDescribedBy() {
		return describedBy;
	}

	@Embedded
	public Money getValue() {
		return value;
	}

	@AssertTrue
	public boolean onlyOrderOrItemSet() {
		return (((conditionForItem == null) && (conditionForOrder != null)) || ((conditionForItem != null) && (conditionForOrder == null)));
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
