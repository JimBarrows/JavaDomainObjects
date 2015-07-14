package jdo.quote.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;

@Entity
public class QuoteRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * UUID for Party.
	 * 
	 */
	private UUID party;
	@ManyToOne
	private QuoteRoleType type;

	public UUID getParty() {
		return party;
	}

	public QuoteRoleType getType() {
		return type;
	}

	public void setParty(UUID party) {
		this.party = party;
	}

	public void setType(QuoteRoleType type) {
		this.type = type;
	}

}
