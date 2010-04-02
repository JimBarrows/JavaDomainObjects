package com.bizondemand.biz360.accounting_order.accounting;

import javax.persistence.Entity;

import java.util.List;

import javax.persistence.OneToMany;

import com.nsfwenterprises.biz360.order.model.OrderItem;

@Entity
public class BudgetItem extends com.nsfwenterprises.biz360.budget.model.BudgetItem {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private List<OrderItem> usedToBuy;

    private List<com.bizondemand.biz360.accounting_order.budget.model.allocation.RequirementBudgetAllocation> providesFundingVia;

    public List<com.bizondemand.biz360.accounting_order.budget.model.allocation.RequirementBudgetAllocation> getProvidesFundingVia() {
        return providesFundingVia;
    }

    public void setProvidesFundingVia(List<com.bizondemand.biz360.accounting_order.budget.model.allocation.RequirementBudgetAllocation> providesFundingVia) {
        this.providesFundingVia = providesFundingVia;
    }

    @OneToMany
	public List<OrderItem> getUsedToBuy() {
		return usedToBuy;
	}


	public void setUsedToBuy(List<OrderItem> usedToBuy) {
		this.usedToBuy = usedToBuy;
	}


}
