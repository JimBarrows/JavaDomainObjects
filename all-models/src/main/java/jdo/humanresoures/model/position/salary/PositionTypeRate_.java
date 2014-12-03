package jdo.humanresoures.model.position.salary;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.asset.PeriodType;
import jdo.fields.Money;
import jdo.humanresoures.model.position.type.PositionType;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-02T21:59:11.248-0700")
@StaticMetamodel(PositionTypeRate.class)
public class PositionTypeRate_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PositionTypeRate, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PositionTypeRate, SalaryStep> associatedWith;
	public static volatile SingularAttribute<PositionTypeRate, PositionType> forPositionType;
	public static volatile SingularAttribute<PositionTypeRate, RateType> forRateType;
	public static volatile SingularAttribute<PositionTypeRate, Money> rate;
	public static volatile SingularAttribute<PositionTypeRate, PeriodType> forPeriodType;
}
