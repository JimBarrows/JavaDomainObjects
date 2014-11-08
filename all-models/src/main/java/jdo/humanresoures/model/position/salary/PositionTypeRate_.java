package jdo.humanresoures.model.position.salary;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.asset.PeriodType;
import jdo.humanresoures.model.position.type.PositionType;
import jdo.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2014-11-07T22:13:42.357-0700")
@StaticMetamodel(PositionTypeRate.class)
public class PositionTypeRate_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PositionTypeRate, SalaryStep> associatedWith;
	public static volatile SingularAttribute<PositionTypeRate, PositionType> forPositionType;
	public static volatile SingularAttribute<PositionTypeRate, RateType> forRateType;
	public static volatile SingularAttribute<PositionTypeRate, PeriodType> forPeriodType;
	public static volatile SingularAttribute<PositionTypeRate, BigDecimal> rate;
}
