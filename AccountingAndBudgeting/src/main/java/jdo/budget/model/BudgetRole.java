package jdo.budget.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;

@Entity
public class BudgetRole extends BasePersistentModel {

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
