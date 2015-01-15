package jdo.party.model.relationship;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.humanresoures.model.termination.TerminationType;

@Generated(value="Dali", date="2015-01-13T23:35:37.368-0700")
@StaticMetamodel(Employment.class)
public class Employment_ extends PartyRelationship_ {
	public static volatile SingularAttribute<Employment, TerminationReason> dueTo;
	public static volatile SingularAttribute<Employment, TerminationType> terminationType;
}
