package com.nsfwenterprises.biz360.budget.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.nsfwenterprises.biz360.budget.model.allocation.PaymentBudgetAllocation;
import com.nsfwenterprises.biz360.budget.model.allocation.RequirementBudgetAllocation;
import com.nsfwenterprises.biz360.budget.model.revision.BudgetRevisionImpact;
import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.order.model.OrderItem;

@Entity
public class BudgetItem extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<BudgetRevisionImpact> affectedBy;
	
	private BigDecimal amount;
	
	private List<BudgetItem> composedOf;
	
	private String justification;
	
	private List<RequirementBudgetAllocation> providesFundingVia;
	
	private String purpose;
	
	private BudgetItemType type;
	
	private List<OrderItem> usedToBuy;
	
	private List<PaymentBudgetAllocation> usedToPay;

	@OneToMany
	public List<BudgetRevisionImpact> getAffectedBy() {
		return affectedBy;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	@ManyToMany
	public List<BudgetItem> getComposedOf() {
		return composedOf;
	}

	public String getJustification() {
		return justification;
	}

	@OneToMany
	public List<RequirementBudgetAllocation> getProvidesFundingVia() {
		return providesFundingVia;
	}

	public String getPurpose() {
		return purpose;
	}

	@ManyToOne
	public BudgetItemType getType() {
		return type;
	}

	@OneToMany
	public List<OrderItem> getUsedToBuy() {
		return usedToBuy;
	}

	@OneToMany
	public List<PaymentBudgetAllocation> getUsedToPay() {
		return usedToPay;
	}

	public void setAffectedBy(List<BudgetRevisionImpact> affectedBy) {
		this.affectedBy = affectedBy;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setComposedOf(List<BudgetItem> composedOf) {
		this.composedOf = composedOf;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public void setProvidesFundingVia(
			List<RequirementBudgetAllocation> providesFundingVia) {
		this.providesFundingVia = providesFundingVia;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public void setType(BudgetItemType type) {
		this.type = type;
	}

	public void setUsedToBuy(List<OrderItem> usedToBuy) {
		this.usedToBuy = usedToBuy;
	}

	public void setUsedToPay(List<PaymentBudgetAllocation> usedToPay) {
		this.usedToPay = usedToPay;
	}

}
