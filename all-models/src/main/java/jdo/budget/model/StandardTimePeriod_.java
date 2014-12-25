package jdo.budget.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.asset.PeriodType;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-24T17:30:45.571-0700")
@StaticMetamodel(StandardTimePeriod.class)
public class StandardTimePeriod_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<StandardTimePeriod, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<StandardTimePeriod, PeriodType> type;
}
