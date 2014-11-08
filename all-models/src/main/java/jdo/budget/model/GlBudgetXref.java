package jdo.budget.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.accounting.model.GeneralLedgerAccount;
import jdo.model.BaseDateRangeModel;

@Entity
public class GlBudgetXref extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int allocationPercentage;
	
	private BudgetItemType mappedToBudgetItemType;
	
	private GeneralLedgerAccount mappedToGlAccount;

	public int getAllocationPercentage() {
		return allocationPercentage;
	}

	@ManyToOne
	public BudgetItemType getMappedToBudgetItemType() {
		return mappedToBudgetItemType;
	}

	@ManyToOne
	public GeneralLedgerAccount getMappedToGlAccount() {
		return mappedToGlAccount;
	}

	public void setAllocationPercentage(int allocationPercentage) {
		this.allocationPercentage = allocationPercentage;
	}

	public void setMappedToBudgetItemType(BudgetItemType mappedToBudgetItemType) {
		this.mappedToBudgetItemType = mappedToBudgetItemType;
	}

	public void setMappedToGlAccount(GeneralLedgerAccount mappedToGlAccount) {
		this.mappedToGlAccount = mappedToGlAccount;
	}

}
