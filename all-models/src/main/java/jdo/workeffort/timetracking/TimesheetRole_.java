package jdo.workeffort.timetracking;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2015-01-11T23:14:25.850-0700")
@StaticMetamodel(TimesheetRole.class)
public class TimesheetRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<TimesheetRole, Party> involving;
	public static volatile SingularAttribute<TimesheetRole, TimeSheetRoleType> type;
}
