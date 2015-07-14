package jdo.budget.model;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.fields.Money;

@Entity
public class PaymentBudgetAllocation extends jdo.model.BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID for Payment.
	 * 
	 */
	private UUID allocationOf;

	@Embedded
	private Money amount;

	@ManyToOne
	private BudgetItem usageOf;

	public UUID getAllocationOf() {
		return allocationOf;
	}

	public Money getAmount() {
		return amount;
	}

	public BudgetItem getUsageOf() {
		return usageOf;
	}

	public void setAllocationOf(UUID allocationOf) {
		this.allocationOf = allocationOf;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public void setUsageOf(BudgetItem usageOf) {
		this.usageOf = usageOf;
	}

}
