package jdo.humanresoures.model.performance;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.PartyRole;

@Generated(value="Dali", date="2014-11-07T22:13:42.279-0700")
@StaticMetamodel(PerformanceNote.class)
public class PerformanceNote_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PerformanceNote, PerformanceNoteType> type;
	public static volatile SingularAttribute<PerformanceNote, String> comment;
	public static volatile SingularAttribute<PerformanceNote, Date> communicationDate;
	public static volatile SingularAttribute<PerformanceNote, PartyRole> forEmployee;
	public static volatile SingularAttribute<PerformanceNote, PartyRole> fromManger;
}
