package mbmp.humanresoures.model.performance;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:20.270-0700")
@StaticMetamodel(PerformanceReviewItem.class)
public class PerformanceReviewItem_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PerformanceReviewItem, String> comment;
	public static volatile SingularAttribute<PerformanceReviewItem, PerformanceReview> partOf;
	public static volatile SingularAttribute<PerformanceReviewItem, PerformanceRatingType> scored;
	public static volatile SingularAttribute<PerformanceReviewItem, PerformanceReviewItemType> type;
}
