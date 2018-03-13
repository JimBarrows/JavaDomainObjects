package jdo.budget.model;

import jdo.accounting.model.GeneralLedgerAccount;
import jdo.fields.DateTimeRange;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class GlBudgetXref extends PersistentEntity {

	/**
	 * 
	 */
	private static final long			serialVersionUID	= 1L;

	private int										allocationPercentage;

	@ManyToOne
	private BudgetItemType				mappedToBudgetItemType;

	@ManyToOne
	private GeneralLedgerAccount	mappedToGlAccount;

	@Embedded
	private DateTimeRange					dateTimeRange			= new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public int getAllocationPercentage() {
		return allocationPercentage;
	}

	public BudgetItemType getMappedToBudgetItemType() {
		return mappedToBudgetItemType;
	}

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
