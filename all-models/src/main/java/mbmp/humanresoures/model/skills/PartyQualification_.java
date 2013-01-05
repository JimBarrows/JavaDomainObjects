package mbmp.humanresoures.model.skills;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-05T07:41:45.657-0700")
@StaticMetamodel(PartyQualification.class)
public class PartyQualification_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PartyQualification, Party> heldBy;
	public static volatile SingularAttribute<PartyQualification, QualificationType> type;
}
