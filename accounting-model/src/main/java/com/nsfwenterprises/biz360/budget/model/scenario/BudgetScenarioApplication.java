package com.nsfwenterprises.biz360.budget.model.scenario;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.AssertTrue;

import org.hibernate.validator.constraints.Range;

import com.nsfwenterprises.biz360.budget.model.Budget;
import com.nsfwenterprises.biz360.budget.model.BudgetItem;
import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class BudgetScenarioApplication extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Budget affectingBudget;
	
	private BudgetItem affectingBudgetItem;
	
	private BigDecimal amountChange;
	
	private BudgetScenario fromScenario;
	
	private int percentChange;

	@AssertTrue
	public boolean affectsOnlyBudgetXorItem() {
		return (affectingBudget != null) ^ (affectingBudgetItem != null); 
	}
	
	@ManyToOne
	public Budget getAffectingBudget() {
		return affectingBudget;
	}

	@ManyToOne
	public BudgetItem getAffectingBudgetItem() {
		return affectingBudgetItem;
	}

	public BigDecimal getAmountChange() {
		return amountChange;
	}

	@ManyToOne
	public BudgetScenario getFromScenario() {
		return fromScenario;
	}

	@Range(min=-100, max=100)
	public int getPercentChange() {
		return percentChange;
	}

	public void setAffectingBudget(Budget affectingBudget) {
		this.affectingBudget = affectingBudget;
	}

	public void setAffectingBudgetItem(BudgetItem affectingBudgetItem) {
		this.affectingBudgetItem = affectingBudgetItem;
	}

	public void setAmountChange(BigDecimal amountChange) {
		this.amountChange = amountChange;
	}

	public void setFromScenario(BudgetScenario fromScenario) {
		this.fromScenario = fromScenario;
	}

	public void setPercentChange(int percentChange) {
		this.percentChange = percentChange;
	}

}
