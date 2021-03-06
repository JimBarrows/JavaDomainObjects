package jdo.shipment.model.receipt;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;

@Entity
public class ShipmentReceiptRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID of the Party.
	 * 
	 */
	@NotNull
	private UUID party;
	@NotNull
	@ManyToOne
	private ShipmentReceiptRoleType type;

	public UUID getParty() {
		return party;
	}

	public ShipmentReceiptRoleType getType() {
		return type;
	}

	public void setParty(UUID party) {
		this.party = party;
	}

	public void setType(ShipmentReceiptRoleType type) {
		this.type = type;
	}
}
