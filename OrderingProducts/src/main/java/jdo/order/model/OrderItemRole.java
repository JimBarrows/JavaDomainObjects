package jdo.order.model;

import jdo.fields.DateTimeRange;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
public class OrderItemRole extends PersistentEntity {

	private static final long serialVersionUID = 1L;

	/** UUID of the Party it's assigned to.
	 * 
	 */
	@NotNull
	private UUID assignedTo;

	@NotNull
	@ManyToOne
	private OrderItemRoleType type;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public UUID getAssignedTo() {
		return assignedTo;
	}

	public OrderItemRoleType getType() {
		return type;
	}

	public void setAssignedTo(UUID assignedTo) {
		this.assignedTo = assignedTo;
	}

	public void setType(OrderItemRoleType type) {
		this.type = type;
	}
}
