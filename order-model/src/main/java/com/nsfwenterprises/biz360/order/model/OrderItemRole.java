package com.nsfwenterprises.biz360.order.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;
import com.nsfwenterprises.biz360.party.model.Party;

@Entity
public class OrderItemRole extends BaseDateRangeModel {
	
	private static final long serialVersionUID = 1L;
	
	private Party assignedTo;
	
	private OrderItemRoleType type;

	@ManyToOne
	@NotNull
	public Party getAssignedTo() {
		return assignedTo;
	}

	@NotNull
	@ManyToOne
	public OrderItemRoleType getType() {
		return type;
	}

	public void setAssignedTo(Party assignedTo) {
		this.assignedTo = assignedTo;
	}

	public void setType(OrderItemRoleType type) {
		this.type = type;
	}
}
