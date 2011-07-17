package mbmp.budget.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import mbmp.model.BaseType;

@Entity
public class BudgetItemType extends BaseType {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<GlBudgetXref> assignedTo;

	@OneToMany
	public List<GlBudgetXref> getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(List<GlBudgetXref> assignedTo) {
		this.assignedTo = assignedTo;
	}
}
