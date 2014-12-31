package jdo.accounting.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

import jdo.budget.model.GlBudgetXref;
import jdo.model.BasePersistentModel;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class GeneralLedgerAccount extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long			serialVersionUID	= 1L;

	@OneToMany
	private List<OrganizationGlAccount>	associatedWith		= new ArrayList<OrganizationGlAccount>();

	@OneToMany
	private List<GlBudgetXref>			budgetLineItems;

	@Lob
	private String						description;

	@NotEmpty
	private String						name;

	
	public List<OrganizationGlAccount> getAssociatedWith() {
		return associatedWith;
	}

	
	public List<GlBudgetXref> getBudgetLineItems() {
		return budgetLineItems;
	}

	public String getDescription() {
		return description;
	}


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
