package jdo.quote.model;

import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class QuoteRole extends PersistentEntity {

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
