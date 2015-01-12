package jdo.quote.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.party.model.Party;

@Entity
public class QuoteRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	@ManyToOne
	private Party				party;
	@ManyToOne
	private QuoteRoleType		type;

	
	public Party getParty() {
		return party;
	}

	
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
