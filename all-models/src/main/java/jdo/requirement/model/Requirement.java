package jdo.requirement.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.budget.model.RequirementBudgetAllocation;
import jdo.fields.Money;
import jdo.model.BasePersistentModel;
import jdo.party.model.facility.Facility;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Requirement extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@OneToMany
	private List<OrderRequirementCommitment> commitmentOf;
	@Temporal(TemporalType.DATE)
	private Date creationDate;
	@Lob
	private String description;
	@Embedded
	private Money estimatedBudget;
	@ManyToOne
	private Facility neededAt;

	private int quantity;
	@Lob
	private String reason;
	@Temporal(TemporalType.DATE)
	private Date requiredBy;
	@OneToMany
	private List<RequirementStatus> status = new ArrayList<RequirementStatus>();
	@OneToMany
	private List<Requirement> subRequirements = new ArrayList<Requirement>();
	@OneToMany
	private List<RequirementBudgetAllocation> allocatedVia = new ArrayList<RequirementBudgetAllocation>();

	public List<RequirementBudgetAllocation> getAllocatedVia() {
		return allocatedVia;
	}

	public void setAllocatedVia(List<RequirementBudgetAllocation> allocatedVia) {
		this.allocatedVia = allocatedVia;
	}

	public List<OrderRequirementCommitment> getCommitmentOf() {
		return commitmentOf;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public String getDescription() {
		return description;
	}

	public Money getEstimatedBudget() {
		return estimatedBudget;
	}

	public Facility getNeededAt() {
		return neededAt;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getReason() {
		return reason;
	}

	public Date getRequiredBy() {
		return requiredBy;
	}

	public List<RequirementStatus> getStatus() {
		return status;
	}

	public List<Requirement> getSubRequirements() {
		return subRequirements;
	}

	public void setCommitmentOf(
			final List<OrderRequirementCommitment> commitmentOf) {
		this.commitmentOf = commitmentOf;
	}

	public void setCreationDate(final Date creationDate) {
		this.creationDate = creationDate;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public void setEstimatedBudget(final Money estimatedBudget) {
		this.estimatedBudget = estimatedBudget;
	}

	public void setNeededAt(final Facility neededAt) {
		this.neededAt = neededAt;
	}

	public void setQuantity(final int quantity) {
		this.quantity = quantity;
	}

	public void setReason(final String reason) {
		this.reason = reason;
	}

	public void setRequiredBy(final Date requiredBy) {
		this.requiredBy = requiredBy;
	}

	public void setStatus(final List<RequirementStatus> status) {
		this.status = status;
	}

	public void setSubRequirements(final List<Requirement> subRequirements) {
		this.subRequirements = subRequirements;
	}
}
