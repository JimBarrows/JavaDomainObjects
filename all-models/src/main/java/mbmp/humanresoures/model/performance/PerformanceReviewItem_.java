package mbmp.humanresoures.model.performance;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-11-07T06:11:39.298-0700")
@StaticMetamodel(PerformanceReviewItem.class)
public class PerformanceReviewItem_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PerformanceReviewItem, PerformanceReview> partOf;
	public static volatile SingularAttribute<PerformanceReviewItem, PerformanceRatingType> scored;
	public static volatile SingularAttribute<PerformanceReviewItem, PerformanceReviewItemType> type;
	public static volatile SingularAttribute<PerformanceReviewItem, String> comment;
}
