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
	@NotNull
	@ManyToOne
	private Party					party;
	@NotNull
	@ManyToOne
	private ShipmentReceiptRoleType	type;

	
	public Party getParty() {
		return party;
	}

	
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
