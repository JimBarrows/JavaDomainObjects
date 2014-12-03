package jdo.party.model.relationship;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.PartyRole;

@Generated(value="Dali", date="2014-11-07T22:13:42.957-0700")
@StaticMetamodel(Employment.class)
public class Employment_ extends PartyRelationship_ {
	public static volatile SingularAttribute<Employment, TerminationReason> dueTo;
	public static volatile SingularAttribute<Employment, PartyRole> relationshipFrom;
	public static volatile SingularAttribute<Employment, PartyRole> relationshipTo;
}
