package mbmp.workeffort.timetracking;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.workeffort.WorkEffort;

@Generated(value="Dali", date="2013-01-05T07:42:07.487-0700")
@StaticMetamodel(TimeEntry.class)
public class TimeEntry_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<TimeEntry, String> comment;
	public static volatile SingularAttribute<TimeEntry, WorkEffort> timeSpendOn;
}
