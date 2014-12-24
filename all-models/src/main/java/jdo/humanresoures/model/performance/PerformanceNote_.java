package jdo.humanresoures.model.performance;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyRole;

@Generated(value="Dali", date="2014-12-24T16:34:40.458-0700")
@StaticMetamodel(PerformanceNote.class)
public class PerformanceNote_ {
	public static volatile SingularAttribute<PerformanceNote, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PerformanceNote, PerformanceNoteType> type;
	public static volatile SingularAttribute<PerformanceNote, String> comment;
	public static volatile SingularAttribute<PerformanceNote, Date> communicationDate;
	public static volatile SingularAttribute<PerformanceNote, PartyRole> forEmployee;
	public static volatile SingularAttribute<PerformanceNote, PartyRole> fromManger;
}
