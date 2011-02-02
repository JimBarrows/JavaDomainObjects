package com.nsfwenterprises.biz360.budget.model.revision;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.nsfwenterprises.biz360.budget.model.Budget;
import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class BudgetRevision extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<BudgetRevisionImpact>affecting;
	
	private Date revisedOn;
	
	private Budget revisionFor;
	
	private long sequence;

	@OneToMany
	public List<BudgetRevisionImpact> getAffecting() {
		return affecting;
	}

	public Date getRevisedOn() {
		return revisedOn;
	}

	@ManyToOne
	public Budget getRevisionFor() {
		return revisionFor;
	}

	public long getSequence() {
		return sequence;
	}

	public void setAffecting(List<BudgetRevisionImpact> affecting) {
		this.affecting = affecting;
	}

	public void setRevisedOn(Date revisedOn) {
		this.revisedOn = revisedOn;
	}

	public void setRevisionFor(Budget revisionFor) {
		this.revisionFor = revisionFor;
	}

	public void setSequence(long sequence) {
		this.sequence = sequence;
	}

}
