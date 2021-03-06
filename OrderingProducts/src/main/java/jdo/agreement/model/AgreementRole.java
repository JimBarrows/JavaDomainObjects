package jdo.agreement.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;

@Entity
public class AgreementRole extends BasePersistentModel {

	private static final long serialVersionUID = 1L;

	@NotNull
	/**
	 * The UUID of the party in this role.
	 * 
	 */
	private UUID party;

	@NotNull
	@ManyToOne
	private AgreementRoleType type;

	public UUID getParty() {
		return party;
	}

	public AgreementRoleType getType() {
		return type;
	}

	public void setParty(UUID party) {
		this.party = party;
	}

	public void setType(AgreementRoleType type) {
		this.type = type;
	}
}
