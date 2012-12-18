package mbmp.agreement.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import mbmp.model.BasePersistentModel;
import mbmp.party.model.Party;

@Entity
public class AgreementRole extends BasePersistentModel {

	private static final long serialVersionUID = 1L;

	private Party party;
	
	private AgreementRoleType type;
	
	@NotNull
	@ManyToOne
	public Party getParty() {
		return party;
	}
	@NotNull
	@ManyToOne
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
