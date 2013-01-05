package mbmp.humanresoures.model.performance;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.humanresoures.model.position.Position;
import mbmp.humanresoures.model.position.salary.PayHistory;
import mbmp.invoice.model.payment.Paycheck;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.PartyRole;

@Generated(value="Dali", date="2013-01-05T07:41:45.389-0700")
@StaticMetamodel(PerformanceReview.class)
public class PerformanceReview_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PerformanceReview, Paycheck> bonus;
	public static volatile SingularAttribute<PerformanceReview, PayHistory> affecting;
	public static volatile SingularAttribute<PerformanceReview, String> comments;
	public static volatile SingularAttribute<PerformanceReview, PartyRole> forEmployee;
	public static volatile SingularAttribute<PerformanceReview, PartyRole> fromManager;
	public static volatile ListAttribute<PerformanceReview, PerformanceReviewItem> items;
	public static volatile SingularAttribute<PerformanceReview, Position> newPosition;
}
