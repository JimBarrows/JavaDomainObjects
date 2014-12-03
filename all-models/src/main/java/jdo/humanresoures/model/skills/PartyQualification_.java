package jdo.humanresoures.model.skills;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-02T20:54:01.870-0700")
@StaticMetamodel(PartyQualification.class)
public class PartyQualification_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PartyQualification, QualificationType> type;
	public static volatile SingularAttribute<PartyQualification, Party> heldBy;
	public static volatile SingularAttribute<PartyQualification, DateTimeRange> dateTimeRange;
}
