package com.bizondemand.biz360.accounting_order.budget.model.allocation;

import com.bizondemand.biz360.accounting_order.accounting.BudgetItem;
import com.nsfwenterprises.biz360.requirement.model.Requirement;

import java.math.BigDecimal;

/**
 * @author jimbarrows
 * @version 1.0
 * @created: Apr 2, 2010 8:48:30 AM
 */
public class RequirementBudgetAllocation {

    private BudgetItem allocatedTo;

    private Requirement allocationOf;

    private BigDecimal amount;

    public BudgetItem getAllocatedTo() {
        return allocatedTo;
    }

    public void setAllocatedTo(BudgetItem allocatedTo) {
        this.allocatedTo = allocatedTo;
    }
}
