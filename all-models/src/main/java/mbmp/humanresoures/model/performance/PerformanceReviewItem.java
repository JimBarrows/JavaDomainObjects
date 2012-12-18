package mbmp.humanresoures.model.performance;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import mbmp.model.BasePersistentModel;

@Entity
public class PerformanceReviewItem extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String comment;
	
	private PerformanceReview partOf;
	
	private PerformanceRatingType scored;
	
	private PerformanceReviewItemType type;

	public String getComment() {
		return comment;
	}

	@ManyToOne
	public PerformanceReview getPartOf() {
		return partOf;
	}

	@ManyToOne
	public PerformanceRatingType getScored() {
		return scored;
	}

	@ManyToOne
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
