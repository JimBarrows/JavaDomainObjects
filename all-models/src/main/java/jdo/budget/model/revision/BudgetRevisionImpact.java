package jdo.budget.model.revision;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import jdo.budget.model.BudgetItem;
import jdo.fields.Money;
import jdo.model.BasePersistentModel;

@Entity
public class BudgetRevisionImpact extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private boolean				add;

	private BudgetItem			affects;

	private BudgetRevision		fromBudgetRevision;

	private String				reason;

	private Money				revisedAmount;

	@ManyToOne
	public BudgetItem getAffects() {
		return affects;
	}

	@ManyToOne
	public BudgetRevision getFromBudgetRevision() {
		return fromBudgetRevision;
	}

	public String getReason() {
		return reason;
	}

	@Embedded
	public Money getRevisedAmount() {
		return revisedAmount;
	}

	@Column(name = "addDelete")
	public boolean isAdd() {
		return add;
	}

	@Transient
	public boolean isDelete() {
		return !add;
	}

	public void setAdd(boolean add) {
		this.add = add;
	}

	public void setAffects(BudgetItem affects) {
		this.affects = affects;
	}

	public void setFromBudgetRevision(BudgetRevision fromBudgetRevision) {
		this.fromBudgetRevision = fromBudgetRevision;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void setRevisedAmount(Money revisedAmount) {
		this.revisedAmount = revisedAmount;
	}

}
