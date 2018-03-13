package jdo.budget.model.scenario;

import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class BudgetScenario extends PersistentEntity {

	/**
	 * 
	 */
	private static final long								serialVersionUID	= 1L;

	@OneToMany
	private List<BudgetScenarioRule>				affectedBy;

	@OneToMany
	private List<BudgetScenarioApplication>	affecting;

	private String													description;

	public List<BudgetScenarioRule> getAffectedBy() {
		return affectedBy;
	}

	public List<BudgetScenarioApplication> getAffecting() {
		return affecting;
	}

	public String getDescription() {
		return description;
	}

	public void setAffectedBy(List<BudgetScenarioRule> affectedBy) {
		this.affectedBy = affectedBy;
	}

	public void setAffecting(List<BudgetScenarioApplication> affecting) {
		this.affecting = affecting;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
