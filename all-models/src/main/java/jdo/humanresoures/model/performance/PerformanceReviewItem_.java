package jdo.humanresoures.model.performance;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-24T16:23:54.556-0700")
@StaticMetamodel(PerformanceReviewItem.class)
public class PerformanceReviewItem_ {
	public static volatile SingularAttribute<PerformanceReviewItem, PerformanceReview> partOf;
	public static volatile SingularAttribute<PerformanceReviewItem, PerformanceRatingType> scored;
	public static volatile SingularAttribute<PerformanceReviewItem, PerformanceReviewItemType> type;
	public static volatile SingularAttribute<PerformanceReviewItem, String> comment;
}
