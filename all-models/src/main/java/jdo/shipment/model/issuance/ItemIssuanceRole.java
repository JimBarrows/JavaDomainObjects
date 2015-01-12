package jdo.shipment.model.issuance;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.party.model.Party;

@Entity
public class ItemIssuanceRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Party roleFor;

	@ManyToOne
	private ItemIssuanceRoleType type;

	public Party getRoleFor() {
		return roleFor;
	}

	public ItemIssuanceRoleType getType() {
		return type;
	}

	public void setRoleFor(Party roleFor) {
		this.roleFor = roleFor;
	}

	public void setType(ItemIssuanceRoleType type) {
		this.type = type;
	}
}
