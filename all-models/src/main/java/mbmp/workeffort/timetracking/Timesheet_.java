package mbmp.workeffort.timetracking;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.PartyRole;

@Generated(value="Dali", date="2013-01-05T07:42:07.514-0700")
@StaticMetamodel(Timesheet.class)
public class Timesheet_ extends BaseDateRangeModel_ {
	public static volatile ListAttribute<Timesheet, TimeEntry> entries;
	public static volatile SingularAttribute<Timesheet, PartyRole> hoursFor;
	public static volatile ListAttribute<Timesheet, TimesheetRole> involving;
}
