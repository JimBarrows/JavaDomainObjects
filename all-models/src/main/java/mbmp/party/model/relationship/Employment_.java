package mbmp.party.model.relationship;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.party.model.PartyRole;

@Generated(value="Dali", date="2013-01-05T08:07:17.662-0700")
@StaticMetamodel(Employment.class)
public class Employment_ extends PartyRelationship_ {
	public static volatile SingularAttribute<Employment, TerminationReason> dueTo;
	public static volatile SingularAttribute<Employment, PartyRole> relationshipFrom;
	public static volatile SingularAttribute<Employment, PartyRole> relationshipTo;
}
