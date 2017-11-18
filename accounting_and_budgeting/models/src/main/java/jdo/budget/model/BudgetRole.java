package jdo.budget.model;

import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class BudgetRole extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID for Party.
	 * 
	 */
	private UUID forParty;

	@ManyToOne
	private BudgetRoleType type;

	public UUID getForParty() {
		return forParty;
	}

	public BudgetRoleType getType() {
		return type;
	}

	public void setForParty(UUID forParty) {
		this.forParty = forParty;
	}

	public void setType(BudgetRoleType type) {
		this.type = type;
	}

}
