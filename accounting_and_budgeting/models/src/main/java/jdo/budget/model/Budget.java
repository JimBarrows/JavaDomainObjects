package jdo.budget.model;

import jdo.budget.model.review.BudgetReview;
import jdo.budget.model.revision.BudgetRevision;
import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Budget extends PersistentEntity {

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;

	@ManyToOne
	private StandardTimePeriod		associatedWith;

	private String					comment;

	@OneToMany
	private List<BudgetItem>		composedOf;

	@OneToMany
	private List<BudgetStatus>		describedBy;

	@OneToMany
	private List<BudgetRole>		involving;

	@OneToMany
	private List<BudgetReview>		reviews;

	@OneToMany
	private List<BudgetRevision>	revisedBy;

	@ManyToOne
	private BudgetType				type;
	
	public StandardTimePeriod getAssociatedWith() {
		return associatedWith;
	}

	public String getComment() {
		return comment;
	}

	
	public List<BudgetItem> getComposedOf() {
		return composedOf;
	}

	
	public List<BudgetStatus> getDescribedBy() {
		return describedBy;
	}


	public List<BudgetRole> getInvolving() {
		return involving;
	}

	public List<BudgetReview> getReviews() {
		return reviews;
	}

	public List<BudgetRevision> getRevisedBy() {
		return revisedBy;
	}


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
