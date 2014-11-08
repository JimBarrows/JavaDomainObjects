package jdo.budget.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.invoice.model.payment.Payment;

@Entity
public class PaymentBudgetAllocation extends jdo.model.BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Payment allocationOf;
	
	private BigDecimal amount;
	
	private BudgetItem usageOf;

	public Payment getAllocationOf() {
		return allocationOf;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	@ManyToOne
	public BudgetItem getUsageOf() {
		return usageOf;
	}

	public void setAllocationOf(Payment allocationOf) {
		this.allocationOf = allocationOf;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setUsageOf(BudgetItem usageOf) {
		this.usageOf = usageOf;
	}

}
