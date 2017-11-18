package jdo.budget.model;

import jdo.model.BasePersistentModel;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class BudgetStatus extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private Budget				forBudget;

	@ManyToOne
	private BudgetStatusType	type;
	
	public Budget getForBudget() {
		return forBudget;
	}


	public BudgetStatusType getType() {
		return type;
	}

	public void setForBudget(Budget forBudget) {
		this.forBudget = forBudget;
	}

	public void setType(BudgetStatusType type) {
		this.type = type;
	}

}
