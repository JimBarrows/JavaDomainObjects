package jdo.agreement.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;
import jdo.party.model.Party;

@Entity
public class AgreementRole extends BasePersistentModel {

	private static final long	serialVersionUID	= 1L;

	@NotNull
	@ManyToOne
	private Party				party;

	@NotNull
	@ManyToOne
	private AgreementRoleType	type;
	
	public Party getParty() {
		return party;
	}


	public AgreementRoleType getType() {
		return type;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public void setType(AgreementRoleType type) {
		this.type = type;
	}
}
