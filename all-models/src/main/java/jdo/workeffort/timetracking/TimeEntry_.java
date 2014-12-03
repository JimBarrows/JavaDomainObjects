package jdo.workeffort.timetracking;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.workeffort.WorkEffort;

@Generated(value="Dali", date="2014-12-02T21:59:11.819-0700")
@StaticMetamodel(TimeEntry.class)
public class TimeEntry_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<TimeEntry, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<TimeEntry, String> comment;
	public static volatile SingularAttribute<TimeEntry, WorkEffort> timeSpendOn;
}
