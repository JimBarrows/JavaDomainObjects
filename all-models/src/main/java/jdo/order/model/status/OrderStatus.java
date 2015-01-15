package jdo.order.model.status;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;
import jdo.order.model.Order;
import jdo.order.model.OrderItem;

@Entity
public class OrderStatus extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	@NotNull
	@ManyToOne
	private OrderStatusType		describedBy;
	@ManyToOne
	private OrderItem			statusForItem;
	@ManyToOne
	private Order				statusForOrder;
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date				statusOn;

	
	public OrderStatusType getDescribedBy() {
		return describedBy;
	}

	
	public OrderItem getStatusForItem() {
		return statusForItem;
	}

	
	public Order getStatusForOrder() {
		return statusForOrder;
	}

	
	public Date getStatusOn() {
		return statusOn;
	}

	@AssertTrue
	public boolean onlyOrderOrItemSet() {
		return (((statusForItem == null) && (statusForOrder != null)) || ((statusForItem != null) && (statusForOrder == null)));
	}

	public void setDescribedBy(OrderStatusType describedBy) {
		this.describedBy = describedBy;
	}

	public void setStatusForItem(OrderItem conditionForItem) {
		this.statusForItem = conditionForItem;
	}

	public void setStatusForOrder(Order conditionForOrder) {
		this.statusForOrder = conditionForOrder;
	}

	public void setStatusOn(Date statusOn) {
		this.statusOn = statusOn;
	}
}
