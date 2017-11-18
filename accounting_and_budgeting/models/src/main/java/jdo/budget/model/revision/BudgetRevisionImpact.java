package jdo.budget.model.revision;

import jdo.budget.model.BudgetItem;
import jdo.fields.Money;
import jdo.model.PersistentEntity;

import javax.persistence.*;

@Entity
public class BudgetRevisionImpact extends PersistentEntity {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Column(name = "addDelete")
	private boolean						add;

	@ManyToOne
	private BudgetItem				affects;

	@ManyToOne
	private BudgetRevision		fromBudgetRevision;

	private String						reason;

	@Embedded
	private Money							revisedAmount;

	public BudgetItem getAffects() {
		return affects;
	}

	public BudgetRevision getFromBudgetRevision() {
		return fromBudgetRevision;
	}

	public String getReason() {
		return reason;
	}

	public Money getRevisedAmount() {
		return revisedAmount;
	}

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
