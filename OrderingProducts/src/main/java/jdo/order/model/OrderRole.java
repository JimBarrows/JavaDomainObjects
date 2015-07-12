package jdo.order.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;

/**
 * 
 * @author Jim.Barrows
 *
 */
@Entity
public class OrderRole extends BasePersistentModel {

	private static final long serialVersionUID = 1L;

	/**
	 * UUID of the party this role involves.
	 * 
	 */
	@NotNull
	private UUID involving;

	@ManyToOne
	@NotNull
	private Order partOf;

	@ManyToOne
	@NotNull
	private OrderRoleType type;

	public UUID getInvolving() {
		return involving;
	}

	public Order getPartOf() {
		return partOf;
	}

	public OrderRoleType getType() {
		return type;
	}

	public void setInvolving(UUID involving) {
		this.involving = involving;
	}

	public void setPartOf(Order partOf) {
		this.partOf = partOf;
	}

	public void setType(OrderRoleType type) {
		this.type = type;
	}
}
