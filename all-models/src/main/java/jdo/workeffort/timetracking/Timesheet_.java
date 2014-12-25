package jdo.workeffort.timetracking;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyRole;

@Generated(value="Dali", date="2014-12-24T17:30:48.867-0700")
@StaticMetamodel(Timesheet.class)
public class Timesheet_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<Timesheet, DateTimeRange> dateTimeRange;
	public static volatile ListAttribute<Timesheet, TimeEntry> entries;
	public static volatile SingularAttribute<Timesheet, PartyRole> hoursFor;
	public static volatile ListAttribute<Timesheet, TimesheetRole> involving;
}
