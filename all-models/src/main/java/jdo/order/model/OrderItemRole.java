package jdo.order.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Entity
public class OrderItemRole extends BasePersistentModel {

	private static final long	serialVersionUID	= 1L;

	private Party				assignedTo;

	private OrderItemRoleType	type;

	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

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
