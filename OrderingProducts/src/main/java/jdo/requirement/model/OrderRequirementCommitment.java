package jdo.requirement.model;

import jdo.model.PersistentEntity;
import jdo.order.model.OrderItem;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

@Entity
public class OrderRequirementCommitment extends PersistentEntity {

	private static final long	serialVersionUID	= 1L;
	@Min(1)
	private int					quantity			= 1;
	@ManyToOne
	private OrderItem			usageOf;

	
	public int getQuantity() {
		return quantity;
	}

	
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
