package jdo.shipment.model.issuance;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;

@Entity
public class ItemIssuanceRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID of the Party.
	 * 
	 */
	private UUID roleFor;

	@ManyToOne
	private ItemIssuanceRoleType type;

	public UUID getRoleFor() {
		return roleFor;
	}

	public ItemIssuanceRoleType getType() {
		return type;
	}

	public void setRoleFor(UUID roleFor) {
		this.roleFor = roleFor;
	}

	public void setType(ItemIssuanceRoleType type) {
		this.type = type;
	}
}
