package jdo.shipment.model.receipt;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;
import jdo.party.model.Party;

@Entity
public class ShipmentReceiptRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;

	private Party					party;

	private ShipmentReceiptRoleType	type;

	@NotNull
	@ManyToOne
	public Party getParty() {
		return party;
	}

	@NotNull
	@ManyToOne
	public ShipmentReceiptRoleType getType() {
		return type;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public void setType(ShipmentReceiptRoleType type) {
		this.type = type;
	}
}
