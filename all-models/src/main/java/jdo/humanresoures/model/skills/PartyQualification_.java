package jdo.humanresoures.model.skills;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-11-07T22:13:42.405-0700")
@StaticMetamodel(PartyQualification.class)
public class PartyQualification_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PartyQualification, QualificationType> type;
	public static volatile SingularAttribute<PartyQualification, Party> heldBy;
}
