package jdo.budget.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import jdo.fields.Money;
import jdo.model.BasePersistentModel;
import jdo.requirement.model.Requirement;

/**
 * @author jimbarrows
 * @version 1.0
 * @created: Apr 2, 2010 8:48:30 AM
 */
@Entity
public class RequirementBudgetAllocation extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private BudgetItem			allocatedTo;

	private Requirement			allocationOf;

	private Money				amount;

	public Requirement getAllocationOf() {
		return allocationOf;
	}

	public void setAllocationOf(Requirement allocationOf) {
		this.allocationOf = allocationOf;
	}

	@Embedded
	public Money getAmount() {
		return amount;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public BudgetItem getAllocatedTo() {
		return allocatedTo;
	}

	public void setAllocatedTo(BudgetItem allocatedTo) {
		this.allocatedTo = allocatedTo;
	}
}
