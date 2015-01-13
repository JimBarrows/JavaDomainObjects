package jdo.budget.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.fields.Money;
import jdo.invoice.model.payment.Payment;

@Entity
public class PaymentBudgetAllocation extends jdo.model.BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private Payment						allocationOf;

	@Embedded
	private Money							amount;

	@ManyToOne
	private BudgetItem				usageOf;

	public Payment getAllocationOf() {
		return allocationOf;
	}

	public Money getAmount() {
		return amount;
	}

	public BudgetItem getUsageOf() {
		return usageOf;
	}

	public void setAllocationOf(Payment allocationOf) {
		this.allocationOf = allocationOf;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public void setUsageOf(BudgetItem usageOf) {
		this.usageOf = usageOf;
	}

}
