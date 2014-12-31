package jdo.budget.model.scenario;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.AssertTrue;

import jdo.budget.model.Budget;
import jdo.budget.model.BudgetItem;
import jdo.fields.Money;
import jdo.model.BasePersistentModel;

import org.hibernate.validator.constraints.Range;

@Entity
public class BudgetScenarioApplication extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private Budget						affectingBudget;

	@ManyToOne
	private BudgetItem				affectingBudgetItem;

	@Embedded
	private Money							amountChange;

	@ManyToOne
	private BudgetScenario		fromScenario;

	@Range(min = -100, max = 100)
	private int								percentChange;

	@AssertTrue
	public boolean affectsOnlyBudgetXorItem() {
		return (affectingBudget != null) ^ (affectingBudgetItem != null);
	}

	public Budget getAffectingBudget() {
		return affectingBudget;
	}

	public BudgetItem getAffectingBudgetItem() {
		return affectingBudgetItem;
	}

	public Money getAmountChange() {
		return amountChange;
	}

	public BudgetScenario getFromScenario() {
		return fromScenario;
	}

	public int getPercentChange() {
		return percentChange;
	}

	public void setAffectingBudget(Budget affectingBudget) {
		this.affectingBudget = affectingBudget;
	}

	public void setAffectingBudgetItem(BudgetItem affectingBudgetItem) {
		this.affectingBudgetItem = affectingBudgetItem;
	}

	public void setAmountChange(Money amountChange) {
		this.amountChange = amountChange;
	}

	public void setFromScenario(BudgetScenario fromScenario) {
		this.fromScenario = fromScenario;
	}

	public void setPercentChange(int percentChange) {
		this.percentChange = percentChange;
	}

}
