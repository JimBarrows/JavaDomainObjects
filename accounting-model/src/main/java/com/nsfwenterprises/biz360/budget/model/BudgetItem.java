package com.nsfwenterprises.biz360.budget.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.nsfwenterprises.biz360.budget.model.revision.BudgetRevisionImpact;
import com.nsfwenterprises.biz360.model.BasePersistentModel;


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
	
	private String purpose;
	
	private BudgetItemType type;

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

	public String getPurpose() {
		return purpose;
	}

	@ManyToOne
	public BudgetItemType getType() {
		return type;
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

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public void setType(BudgetItemType type) {
		this.type = type;
	}

}
