package mbmp.budget.model.scenario;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import mbmp.model.BasePersistentModel;

@Entity
public class BudgetScenario extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<BudgetScenarioRule> affectedBy;
	
	private List<BudgetScenarioApplication> affecting;
	
	private String description;

	@OneToMany
	public List<BudgetScenarioRule> getAffectedBy() {
		return affectedBy;
	}

	@OneToMany
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
