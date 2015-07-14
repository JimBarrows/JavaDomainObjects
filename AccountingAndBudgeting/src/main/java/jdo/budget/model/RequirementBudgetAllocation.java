package jdo.budget.model;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.fields.Money;
import jdo.model.BasePersistentModel;

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
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private BudgetItem allocatedTo;

	/**
	 * UUID for Requirement.
	 * 
	 */
	private UUID allocationOf;

	@Embedded
	private Money amount;

	public UUID getAllocationOf() {
		return allocationOf;
	}

	public void setAllocationOf(UUID allocationOf) {
		this.allocationOf = allocationOf;
	}

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
