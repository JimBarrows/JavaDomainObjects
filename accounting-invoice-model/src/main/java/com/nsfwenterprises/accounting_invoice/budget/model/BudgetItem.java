package com.nsfwenterprises.accounting_invoice.budget.model;

import java.util.List;

import javax.persistence.OneToMany;

import org.hibernate.annotations.Entity;

import com.nsfwenterprises.accounting_invoice.budget.model.allocation.PaymentBudgetAllocation;

/**
 * @author jimbarrows
 * @version 1.0
 * @created: Apr 2, 2010 8:57:30 AM
 */
@Entity
public class BudgetItem extends com.nsfwenterprises.biz360.budget.model.BudgetItem {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<PaymentBudgetAllocation> usedToPay;

	@OneToMany
	public List<PaymentBudgetAllocation> getUsedToPay() {
		return usedToPay;
	}

	public void setUsedToPay(List<PaymentBudgetAllocation> usedToPay) {
		this.usedToPay = usedToPay;
	}
    

}
