package jdo.budget.model.scenario;

import jdo.budget.model.BudgetItemType;
import jdo.fields.Money;
import jdo.model.PersistentEntity;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class BudgetScenarioRule extends PersistentEntity {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Embedded
	private Money				amountChange;

	@ManyToOne
	private BudgetScenario		forScenario;

	@ManyToOne
	private BudgetItemType		forType;

	@Range(min = -100, max = 100)
	private int					percentChange;

	
	public Money getAmountChange() {
		return amountChange;
	}
	
	public BudgetScenario getForScenario() {
		return forScenario;
	}

	public BudgetItemType getForType() {
		return forType;
	}
	
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
