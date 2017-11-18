package jdo.budget.model.review;

import jdo.budget.model.Budget;
import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.UUID;

@Entity
public class BudgetReview extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String comment;

	@ManyToOne
	private Budget forBudget;

	/**
	 * UUID for Party.
	 * 
	 */
	private UUID ofParty;

	@ManyToOne
	private BudgetReviewResultType result;

	private Date reviewDate;

	public String getComment() {
		return comment;
	}

	public Budget getForBudget() {
		return forBudget;
	}

	public UUID getOfParty() {
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

	public void setOfParty(UUID ofParty) {
		this.ofParty = ofParty;
	}

	public void setResult(BudgetReviewResultType result) {
		this.result = result;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

}
