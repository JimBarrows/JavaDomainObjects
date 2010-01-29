package com.nsfwenterprises.biz360.requirement.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.party.model.facility.Facility;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Requirement extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<OrderRequirementCommitment> commitmentOf;

	private Date creationDate;

	private String description;

	private BigDecimal estimatedBudget;

	private Facility neededAt;

	private int quantity;

	private String reason;

	private Date requiredBy;

	private List<RequirementStatus> status = new ArrayList<RequirementStatus>();

	private List<Requirement> subRequirements = new ArrayList<Requirement>();

	@OneToMany
	public List<OrderRequirementCommitment> getCommitmentOf() {
		return commitmentOf;
	}

	@Temporal(TemporalType.DATE)
	public Date getCreationDate() {
		return creationDate;
	}

	@Lob
	public String getDescription() {
		return description;
	}

	public BigDecimal getEstimatedBudget() {
		return estimatedBudget;
	}

	@ManyToOne
	public Facility getNeededAt() {
		return neededAt;
	}

	public int getQuantity() {
		return quantity;
	}

	@Lob
	public String getReason() {
		return reason;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getRequiredBy() {
		return requiredBy;
	}

	@OneToMany
	public List<RequirementStatus> getStatus() {
		return status;
	}

	@OneToMany
	public List<Requirement> getSubRequirements() {
		return subRequirements;
	}

	public void setCommitmentOf(final List<OrderRequirementCommitment> commitmentOf) {
		this.commitmentOf = commitmentOf;
	}

	public void setCreationDate(final Date creationDate) {
		this.creationDate = creationDate;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public void setEstimatedBudget(final BigDecimal estimatedBudget) {
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
