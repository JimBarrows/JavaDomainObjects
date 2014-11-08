package jdo.order.model.terms;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;
import jdo.order.model.Order;
import jdo.order.model.OrderItem;

@Entity
public class OrderTerm extends BasePersistentModel {

	private static final long serialVersionUID = 1L;

	private OrderItem conditionForItem;

	private Order conditionForOrder;

	private OrderTermType describedBy;
	
	private BigDecimal value;

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

	public BigDecimal getValue() {
		return value;
	}

	@AssertTrue
	public boolean onlyOrderOrItemSet() {
		return ( 	((conditionForItem == null) && (conditionForOrder !=null)) 
				|| 	((conditionForItem != null) && (conditionForOrder ==null)));
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

	public void setValue(BigDecimal value) {
		this.value = value;
	}
}
