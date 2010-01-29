package com.nsfwenterprises.biz360.budget.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class BudgetStatus extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Budget forBudget;
	
	private BudgetStatusType type;

	@ManyToOne
	public Budget getForBudget() {
		return forBudget;
	}

	@ManyToOne
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
