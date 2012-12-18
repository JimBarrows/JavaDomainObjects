package mbmp.party.model.communication;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import mbmp.party.model.PartyContactMechanism;
import mbmp.party.model.relationship.PartyRelationship;

@Generated(value="Dali", date="2011-12-07T19:49:01.990-0700")
@StaticMetamodel(CommunicationEvent.class)
public class CommunicationEvent_ {
	public static volatile ListAttribute<CommunicationEvent, Case> asPartOf;
	public static volatile ListAttribute<CommunicationEvent, CommunicationEventPurpose> categorizedBy;
	public static volatile SingularAttribute<CommunicationEvent, Date> dateTimeEnded;
	public static volatile SingularAttribute<CommunicationEvent, Date> dateTimeStarted;
	public static volatile SingularAttribute<CommunicationEvent, PartyRelationship> inTheContextOf;
	public static volatile ListAttribute<CommunicationEvent, CommunicationEventRole> involving;
	public static volatile SingularAttribute<CommunicationEvent, CommunicationEventStatusType> monitoredBy;
	public static volatile SingularAttribute<CommunicationEvent, String> note;
	public static volatile SingularAttribute<CommunicationEvent, PartyContactMechanism> occursVia;
}
