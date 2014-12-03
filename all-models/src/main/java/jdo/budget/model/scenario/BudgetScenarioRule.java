package jdo.budget.model.scenario;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.budget.model.BudgetItemType;
import jdo.fields.Money;
import jdo.model.BasePersistentModel;

import org.hibernate.validator.constraints.Range;

@Entity
public class BudgetScenarioRule extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private Money				amountChange;

	private BudgetScenario		forScenario;

	private BudgetItemType		forType;

	private int					percentChange;

	@Embedded
	public Money getAmountChange() {
		return amountChange;
	}

	@ManyToOne
	public BudgetScenario getForScenario() {
		return forScenario;
	}

	@ManyToOne
	public BudgetItemType getForType() {
		return forType;
	}

	@Range(min = -100, max = 100)
	public int getPercentChange() {
		return percentChange;
	}

	public void setAmountChange(Money amountChange) {
		this.amountChange = amountChange;
	}

	public void setForScenario(BudgetScenario forScenario) {
		this.forScenario = forScenario;
	}

	public void setForType(BudgetItemType forType) {
		this.forType = forType;
	}

	public void setPercentChange(int percentChange) {
		this.percentChange = percentChange;
	}
}
