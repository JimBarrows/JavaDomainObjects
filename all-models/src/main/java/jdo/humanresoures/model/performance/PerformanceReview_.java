package jdo.humanresoures.model.performance;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.humanresoures.model.position.Position;
import jdo.humanresoures.model.position.salary.PayHistory;
import jdo.invoice.model.payment.Paycheck;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.PartyRole;

@Generated(value="Dali", date="2014-11-07T22:13:42.297-0700")
@StaticMetamodel(PerformanceReview.class)
public class PerformanceReview_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PerformanceReview, PayHistory> affecting;
	public static volatile ListAttribute<PerformanceReview, PerformanceReviewItem> items;
	public static volatile SingularAttribute<PerformanceReview, Position> newPosition;
	public static volatile SingularAttribute<PerformanceReview, Paycheck> bonus;
	public static volatile SingularAttribute<PerformanceReview, String> comments;
	public static volatile SingularAttribute<PerformanceReview, PartyRole> forEmployee;
	public static volatile SingularAttribute<PerformanceReview, PartyRole> fromManager;
}
