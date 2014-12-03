package jdo.budget.model;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.budget.model.revision.BudgetRevisionImpact;
import jdo.fields.Money;
import jdo.model.BasePersistentModel;
import jdo.order.model.OrderItem;

@Entity
public class BudgetItem extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long					serialVersionUID	= 1L;

	private List<BudgetRevisionImpact>			affectedBy;

	private Money								amount;

	private List<BudgetItem>					composedOf;

	private String								justification;

	private String								purpose;

	private BudgetItemType						type;

	private List<PaymentBudgetAllocation>		usedToPay;

	private List<OrderItem>						usedToBuy;

	private List<RequirementBudgetAllocation>	providesFundingVia;

	@OneToMany
	public List<RequirementBudgetAllocation> getProvidesFundingVia() {
		return providesFundingVia;
	}

	public void setProvidesFundingVia(List<RequirementBudgetAllocation> providesFundingVia) {
		this.providesFundingVia = providesFundingVia;
	}

	@OneToMany
	public List<OrderItem> getUsedToBuy() {
		return usedToBuy;
	}

	public void setUsedToBuy(List<OrderItem> usedToBuy) {
		this.usedToBuy = usedToBuy;
	}

	@OneToMany
	public List<PaymentBudgetAllocation> getUsedToPay() {
		return usedToPay;
	}

	public void setUsedToPay(List<PaymentBudgetAllocation> usedToPay) {
		this.usedToPay = usedToPay;
	}

	@OneToMany
	public List<BudgetRevisionImpact> getAffectedBy() {
		return affectedBy;
	}

	@Embedded
	public Money getAmount() {
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

	public void setAmount(Money amount) {
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
