package com.nsfwenterprises.biz360.order.model.status;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.AssertTrue;
import org.hibernate.validator.NotNull;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.order.model.Order;
import com.nsfwenterprises.biz360.order.model.OrderItem;

@Entity
public class OrderStatus extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private OrderStatusType describedBy;

	private OrderItem statusForItem;

	private Order statusForOrder;
	
	private Date statusOn;

	@NotNull
	@ManyToOne
	public OrderStatusType getDescribedBy() {
		return describedBy;
	}


	@ManyToOne
	public OrderItem getStatusForItem() {
		return statusForItem;
	}

	@ManyToOne
	public Order getStatusForOrder() {
		return statusForOrder;
	}

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	public Date getStatusOn() {
		return statusOn;
	}

	@AssertTrue
	public boolean onlyOrderOrItemSet() {
		return ( 	((statusForItem == null) && (statusForOrder !=null)) 
				|| 	((statusForItem != null) && (statusForOrder ==null)));
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