package mbmp.accounting_order.budget.model.allocation;

import java.math.BigDecimal;

import mbmp.accounting_order.accounting.BudgetItem;
import mbmp.accounting_order.order.Requirement;

/**
 * @author jimbarrows
 * @version 1.0
 * @created: Apr 2, 2010 8:48:30 AM
 */
public class RequirementBudgetAllocation {

    private BudgetItem allocatedTo;

    private Requirement allocationOf;

    private BigDecimal amount;

    public Requirement getAllocationOf() {
		return allocationOf;
	}

	public void setAllocationOf(Requirement allocationOf) {
		this.allocationOf = allocationOf;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BudgetItem getAllocatedTo() {
        return allocatedTo;
    }

    public void setAllocatedTo(BudgetItem allocatedTo) {
        this.allocatedTo = allocatedTo;
    }
}
