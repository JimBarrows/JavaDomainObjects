package jdo.humanresoures.model.performance;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyRole;

@Generated(value = "Dali", date = "2014-12-02T21:35:28.718-0700")
@StaticMetamodel(PerformanceNote.class)
public class PerformanceNote_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PerformanceNote, PerformanceNoteType>	type;
	public static volatile SingularAttribute<PerformanceNote, String>				comment;
	public static volatile SingularAttribute<PerformanceNote, Date>					communicationDate;
	public static volatile SingularAttribute<PerformanceNote, PartyRole>			forEmployee;
	public static volatile SingularAttribute<PerformanceNote, PartyRole>			fromManger;
	public static volatile SingularAttribute<PerformanceNote, DateTimeRange>		dateTimeRange;
}
