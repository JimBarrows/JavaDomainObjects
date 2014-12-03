package jdo.budget.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.budget.model.review.BudgetReview;
import jdo.budget.model.revision.BudgetRevision;
import jdo.model.BasePersistentModel;

@Entity
public class Budget extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;

	private StandardTimePeriod		associatedWith;

	private String					comment;

	private List<BudgetItem>		composedOf;

	private List<BudgetStatus>		describedBy;

	private List<BudgetRole>		involving;

	private List<BudgetReview>		reviews;

	private List<BudgetRevision>	revisedBy;

	private BudgetType				type;

	@ManyToOne
	public StandardTimePeriod getAssociatedWith() {
		return associatedWith;
	}

	public String getComment() {
		return comment;
	}

	@OneToMany
	public List<BudgetItem> getComposedOf() {
		return composedOf;
	}

	@OneToMany
	public List<BudgetStatus> getDescribedBy() {
		return describedBy;
	}

	@OneToMany
	public List<BudgetRole> getInvolving() {
		return involving;
	}

	@OneToMany
	public List<BudgetReview> getReviews() {
		return reviews;
	}

	@OneToMany
	public List<BudgetRevision> getRevisedBy() {
		return revisedBy;
	}

	@ManyToOne
	public BudgetType getType() {
		return type;
	}

	public void setAssociatedWith(StandardTimePeriod associatedWith) {
		this.associatedWith = associatedWith;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setComposedOf(List<BudgetItem> composedOf) {
		this.composedOf = composedOf;
	}

	public void setDescribedBy(List<BudgetStatus> describedBy) {
		this.describedBy = describedBy;
	}

	public void setInvolving(List<BudgetRole> involving) {
		this.involving = involving;
	}

	public void setReviews(List<BudgetReview> reviews) {
		this.reviews = reviews;
	}

	public void setRevisedBy(List<BudgetRevision> revisedBy) {
		this.revisedBy = revisedBy;
	}

	public void setType(BudgetType type) {
		this.type = type;
	}
}
