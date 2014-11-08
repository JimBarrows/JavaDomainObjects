package mbmp.humanresoures.model.position.salary;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.accounting.model.asset.PeriodType;
import mbmp.humanresoures.model.position.type.PositionType;
import mbmp.model.BaseDateRangeModel_;

@Generated(value="Dali", date="2014-11-07T06:11:39.340-0700")
@StaticMetamodel(PositionTypeRate.class)
public class PositionTypeRate_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PositionTypeRate, SalaryStep> associatedWith;
	public static volatile SingularAttribute<PositionTypeRate, PositionType> forPositionType;
	public static volatile SingularAttribute<PositionTypeRate, RateType> forRateType;
	public static volatile SingularAttribute<PositionTypeRate, PeriodType> forPeriodType;
	public static volatile SingularAttribute<PositionTypeRate, BigDecimal> rate;
}
