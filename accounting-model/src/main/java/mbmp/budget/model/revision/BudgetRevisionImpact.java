package mbmp.budget.model.revision;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import mbmp.budget.model.BudgetItem;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class BudgetRevisionImpact extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean add;
	
	private BudgetItem affects;
	
	private BudgetRevision fromBudgetRevision;
	
	private String reason;
	
	private BigDecimal revisedAmount;
	
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

	public BigDecimal getRevisedAmount() {
		return revisedAmount;
	}

	@Column(name="addDelete")
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

	public void setRevisedAmount(BigDecimal revisedAmount) {
		this.revisedAmount = revisedAmount;
	}

}
