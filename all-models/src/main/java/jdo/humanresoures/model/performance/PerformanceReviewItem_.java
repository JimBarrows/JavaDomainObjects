package jdo.humanresoures.model.performance;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T22:13:42.302-0700")
@StaticMetamodel(PerformanceReviewItem.class)
public class PerformanceReviewItem_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PerformanceReviewItem, PerformanceReview> partOf;
	public static volatile SingularAttribute<PerformanceReviewItem, PerformanceRatingType> scored;
	public static volatile SingularAttribute<PerformanceReviewItem, PerformanceReviewItemType> type;
	public static volatile SingularAttribute<PerformanceReviewItem, String> comment;
}
