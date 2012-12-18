package mbmp.quote.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import mbmp.model.BasePersistentModel;
import mbmp.party.model.Party;

@Entity
public class QuoteRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Party party;
	
	private QuoteRoleType type;

	@ManyToOne
	public Party getParty() {
		return party;
	}

	@ManyToOne
	public QuoteRoleType getType() {
		return type;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public void setType(QuoteRoleType type) {
		this.type = type;
	}

}
