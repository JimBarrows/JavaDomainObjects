package mbmp.workeffort.timetracking;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-04T22:11:23.660-0700")
@StaticMetamodel(TimesheetRole.class)
public class TimesheetRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<TimesheetRole, Party> involving;
	public static volatile SingularAttribute<TimesheetRole, TimeSheetRoleType> type;
}
