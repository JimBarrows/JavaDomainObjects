package jdo.budget.model.review;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.budget.model.Budget;
import jdo.model.BasePersistentModel;
import jdo.party.model.Party;

@Entity
public class BudgetReview extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long				serialVersionUID	= 1L;

	private String									comment;

	@ManyToOne
	private Budget									forBudget;

	private Party										ofParty;

	@ManyToOne
	private BudgetReviewResultType	result;

	private Date										reviewDate;

	public String getComment() {
		return comment;
	}

	public Budget getForBudget() {
		return forBudget;
	}

	public Party getOfParty() {
		return ofParty;
	}

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
