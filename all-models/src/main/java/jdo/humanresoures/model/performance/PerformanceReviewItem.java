package jdo.humanresoures.model.performance;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;

@Entity
public class PerformanceReviewItem extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long					serialVersionUID	= 1L;

	private String										comment;

	@ManyToOne
	private PerformanceReview					partOf;

	@ManyToOne
	private PerformanceRatingType			scored;

	@ManyToOne
	private PerformanceReviewItemType	type;

	public String getComment() {
		return comment;
	}

	public PerformanceReview getPartOf() {
		return partOf;
	}

	public PerformanceRatingType getScored() {
		return scored;
	}

	public PerformanceReviewItemType getType() {
		return type;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setPartOf(PerformanceReview partOf) {
		this.partOf = partOf;
	}

	public void setScored(PerformanceRatingType scored) {
		this.scored = scored;
	}

	public void setType(PerformanceReviewItemType type) {
		this.type = type;
	}

}
