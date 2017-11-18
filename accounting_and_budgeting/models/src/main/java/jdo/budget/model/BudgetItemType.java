package jdo.budget.model;

import jdo.model.BaseType;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class BudgetItemType extends BaseType {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@OneToMany
	private List<GlBudgetXref>	assignedTo;
	
	public List<GlBudgetXref> getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(List<GlBudgetXref> assignedTo) {
		this.assignedTo = assignedTo;
	}
}
