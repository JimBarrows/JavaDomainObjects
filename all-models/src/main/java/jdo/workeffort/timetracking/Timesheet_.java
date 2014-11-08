package jdo.workeffort.timetracking;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.PartyRole;

@Generated(value="Dali", date="2014-11-07T22:13:43.699-0700")
@StaticMetamodel(Timesheet.class)
public class Timesheet_ extends BaseDateRangeModel_ {
	public static volatile ListAttribute<Timesheet, TimeEntry> entries;
	public static volatile SingularAttribute<Timesheet, PartyRole> hoursFor;
	public static volatile ListAttribute<Timesheet, TimesheetRole> involving;
}
