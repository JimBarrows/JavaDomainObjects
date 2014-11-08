package jdo.humanresoures.model.position.salary;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.asset.PeriodType;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.relationship.Employment;

@Generated(value="Dali", date="2014-11-07T22:13:42.353-0700")
@StaticMetamodel(PayHistory.class)
public class PayHistory_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PayHistory, Employment> recordFor;
	public static volatile SingularAttribute<PayHistory, SalaryStep> step;
	public static volatile SingularAttribute<PayHistory, BigDecimal> amount;
	public static volatile SingularAttribute<PayHistory, String> comment;
	public static volatile SingularAttribute<PayHistory, PeriodType> forPeriodType;
}
