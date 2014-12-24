package jdo.budget.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.asset.PeriodType;
import jdo.model.DateTimeRange;

@Generated(value="Dali", date="2014-12-24T16:34:40.413-0700")
@StaticMetamodel(StandardTimePeriod.class)
public class StandardTimePeriod_ {
	public static volatile SingularAttribute<StandardTimePeriod, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<StandardTimePeriod, PeriodType> type;
}
