package jdo.requirement.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import jdo.model.BasePersistentModel;
import jdo.order.model.OrderItem;

@Entity
public class OrderRequirementCommitment extends BasePersistentModel {

	private static final long	serialVersionUID	= 1L;

	private int					quantity			= 1;

	private OrderItem			usageOf;

	@Min(1)
	public int getQuantity() {
		return quantity;
	}

	@ManyToOne
	public OrderItem getUsageOf() {
		return usageOf;
	}

	public void setQuantity(final int quantity) {
		this.quantity = quantity;
	}

	public void setUsageOf(final OrderItem usageOf) {
		this.usageOf = usageOf;
	}
}
