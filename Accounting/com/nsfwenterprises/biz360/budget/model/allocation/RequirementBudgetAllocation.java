package com.nsfwenterprises.biz360.budget.model.allocation;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.budget.model.BudgetItem;
import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.requirement.model.Requirement;

@Entity
public class RequirementBudgetAllocation extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BudgetItem allocatedTo;
	
	private Requirement allocationOf;
	
	private BigDecimal amount;

	@ManyToOne
	public BudgetItem getAllocatedTo() {
		return allocatedTo;
	}

	public Requirement getAllocationOf() {
		return allocationOf;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAllocatedTo(BudgetItem allocatedTo) {
		this.allocatedTo = allocatedTo;
	}

	public void setAllocationOf(Requirement allocationOf) {
		this.allocationOf = allocationOf;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
