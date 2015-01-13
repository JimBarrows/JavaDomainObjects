package jdo.budget.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.party.model.Party;

@Entity
public class BudgetRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private Party				forParty;

	@ManyToOne
	private BudgetRoleType		type;

	public Party getForParty() {
		return forParty;
	}

	public BudgetRoleType getType() {
		return type;
	}

	public void setForParty(Party forParty) {
		this.forParty = forParty;
	}

	public void setType(BudgetRoleType type) {
		this.type = type;
	}

}
