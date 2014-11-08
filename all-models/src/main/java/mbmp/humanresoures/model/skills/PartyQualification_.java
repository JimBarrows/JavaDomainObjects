package mbmp.humanresoures.model.skills;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2014-11-07T06:11:39.374-0700")
@StaticMetamodel(PartyQualification.class)
public class PartyQualification_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PartyQualification, QualificationType> type;
	public static volatile SingularAttribute<PartyQualification, Party> heldBy;
}
