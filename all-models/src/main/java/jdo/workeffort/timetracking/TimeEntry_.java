package jdo.workeffort.timetracking;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.workeffort.WorkEffort;

@Generated(value="Dali", date="2014-11-07T22:13:43.691-0700")
@StaticMetamodel(TimeEntry.class)
public class TimeEntry_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<TimeEntry, String> comment;
	public static volatile SingularAttribute<TimeEntry, WorkEffort> timeSpendOn;
}
