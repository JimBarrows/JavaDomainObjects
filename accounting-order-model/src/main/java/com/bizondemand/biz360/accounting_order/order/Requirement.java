package com.bizondemand.biz360.accounting_order.order;

import com.bizondemand.biz360.accounting_order.budget.model.allocation.RequirementBudgetAllocation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jimbarrows
 * @version 1.0
 * @created: Apr 2, 2010 9:26:38 AM
 */
public class Requirement extends com.nsfwenterprises.biz360.requirement.model.Requirement{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<RequirementBudgetAllocation> allocatedVia = new ArrayList<RequirementBudgetAllocation>();

    public List<RequirementBudgetAllocation> getAllocatedVia() {
        return allocatedVia;
    }

    public void setAllocatedVia(List<RequirementBudgetAllocation> allocatedVia) {
        this.allocatedVia = allocatedVia;
    }
}
