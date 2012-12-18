package mbmp.party.model.relationship;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import mbmp.party.model.PartyRole;

@Generated(value="Dali", date="2011-12-07T19:49:02.251-0700")
@StaticMetamodel(Employment.class)
public class Employment_ extends PartyRelationship_ {
	public static volatile SingularAttribute<Employment, TerminationReason> dueTo;
	public static volatile SingularAttribute<Employment, PartyRole> relationshipFrom;
	public static volatile SingularAttribute<Employment, PartyRole> relationshipTo;
}
