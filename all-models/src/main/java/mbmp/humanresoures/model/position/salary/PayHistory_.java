package mbmp.humanresoures.model.position.salary;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.accounting.model.asset.PeriodType;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.relationship.Employment;

@Generated(value="Dali", date="2013-01-05T07:41:45.529-0700")
@StaticMetamodel(PayHistory.class)
public class PayHistory_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PayHistory, BigDecimal> amount;
	public static volatile SingularAttribute<PayHistory, String> comment;
	public static volatile SingularAttribute<PayHistory, PeriodType> forPeriodType;
	public static volatile SingularAttribute<PayHistory, Employment> recordFor;
	public static volatile SingularAttribute<PayHistory, SalaryStep> step;
}
