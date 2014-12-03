package jdo.order.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;
import jdo.party.model.Party;

/**
 * 
 * @author Jim.Barrows
 *
 */
@Entity
public class OrderRole extends BasePersistentModel {

	private static final long	serialVersionUID	= 1L;

	private Party				involving;

	private Order				partOf;

	private OrderRoleType		type;

	@ManyToOne
	@NotNull
	public Party getInvolving() {
		return involving;
	}

	@ManyToOne
	@NotNull
	public Order getPartOf() {
		return partOf;
	}

	@ManyToOne
	@NotNull
	public OrderRoleType getType() {
		return type;
	}

	public void setInvolving(Party involving) {
		this.involving = involving;
	}

	public void setPartOf(Order partOf) {
		this.partOf = partOf;
	}

	public void setType(OrderRoleType type) {
		this.type = type;
	}
}
