package jdo.accounting.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import jdo.budget.model.GlBudgetXref;
import jdo.model.BasePersistentModel;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class GeneralLedgerAccount extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long			serialVersionUID	= 1L;

	private List<OrganizationGlAccount>	associatedWith		= new ArrayList<OrganizationGlAccount>();

	private List<GlBudgetXref>			budgetLineItems;

	private String						description;

	private String						name;

	@OneToMany
	public List<OrganizationGlAccount> getAssociatedWith() {
		return associatedWith;
	}

	@OneToMany
	public List<GlBudgetXref> getBudgetLineItems() {
		return budgetLineItems;
	}

	public String getDescription() {
		return description;
	}

	@org.hibernate.validator.constraints.NotEmpty
	public String getName() {
		return name;
	}

	public void setAssociatedWith(List<OrganizationGlAccount> associatedWith) {
		this.associatedWith = associatedWith;
	}

	public void setBudgetLineItems(List<GlBudgetXref> budgetLineItems) {
		this.budgetLineItems = budgetLineItems;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}
}
