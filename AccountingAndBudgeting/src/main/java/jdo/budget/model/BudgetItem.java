package jdo.budget.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.budget.model.revision.BudgetRevisionImpact;
import jdo.fields.Money;
import jdo.model.BasePersistentModel;

@Entity
public class BudgetItem extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToMany
	private List<BudgetRevisionImpact> affectedBy;

	@Embedded
	private Money amount;

	@ManyToMany
	private List<BudgetItem> composedOf;

	private String justification;

	private String purpose;

	@ManyToOne
	private BudgetItemType type;

	@OneToMany
	private List<PaymentBudgetAllocation> usedToPay;

	/**
	 * UUID for OrderItem.
	 * 
	 */
	@ElementCollection
	private List<UUID> usedToBuy;

	@OneToMany
	private List<RequirementBudgetAllocation> providesFundingVia;

	public List<RequirementBudgetAllocation> getProvidesFundingVia() {
		return providesFundingVia;
	}

	public void setProvidesFundingVia(List<RequirementBudgetAllocation> providesFundingVia) {
		this.providesFundingVia = providesFundingVia;
	}

	public List<UUID> getUsedToBuy() {
		return usedToBuy;
	}

	public void setUsedToBuy(List<UUID> usedToBuy) {
		this.usedToBuy = usedToBuy;
	}

	public List<PaymentBudgetAllocation> getUsedToPay() {
		return usedToPay;
	}

	public void setUsedToPay(List<PaymentBudgetAllocation> usedToPay) {
		this.usedToPay = usedToPay;
	}

	public List<BudgetRevisionImpact> getAffectedBy() {
		return affectedBy;
	}

	public Money getAmount() {
		return amount;
	}

	public List<BudgetItem> getComposedOf() {
		return composedOf;
	}

	public String getJustification() {
		return justification;
	}

	public String getPurpose() {
		return purpose;
	}

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
