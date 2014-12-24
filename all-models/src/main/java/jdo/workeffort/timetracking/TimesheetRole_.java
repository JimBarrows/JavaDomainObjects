package jdo.workeffort.timetracking;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-24T16:23:57.873-0700")
@StaticMetamodel(TimesheetRole.class)
public class TimesheetRole_ {
	public static volatile SingularAttribute<TimesheetRole, Party> involving;
	public static volatile SingularAttribute<TimesheetRole, TimeSheetRoleType> type;
}
