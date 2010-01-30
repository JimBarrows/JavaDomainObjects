package com.nsfwenterprises.biz360.budget.model.review;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.budget.model.Budget;
import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.party.model.Party;

@Entity
public class BudgetReview extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String comment;
	
	private Budget forBudget;
	
	private Party ofParty;
	
	private BudgetReviewResultType result;
	
	private Date reviewDate;

	public String getComment() {
		return comment;
	}

	@ManyToOne
	public Budget getForBudget() {
		return forBudget;
	}

	public Party getOfParty() {
		return ofParty;
	}

	@ManyToOne
	public BudgetReviewResultType getResult() {
		return result;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setForBudget(Budget forBudget) {
		this.forBudget = forBudget;
	}

	public void setOfParty(Party ofParty) {
		this.ofParty = ofParty;
	}

	public void setResult(BudgetReviewResultType result) {
		this.result = result;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

}
