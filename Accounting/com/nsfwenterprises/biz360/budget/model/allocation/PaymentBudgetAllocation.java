package com.nsfwenterprises.biz360.budget.model.allocation;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.budget.model.BudgetItem;
import com.nsfwenterprises.biz360.invoice.model.payment.Payment;
import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class PaymentBudgetAllocation extends BasePersistentModel {

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
