package jdo.party.model.communication;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.PartyContactMechanism;
import jdo.party.model.relationship.PartyRelationship;

@Generated(value="Dali", date="2014-11-07T22:13:42.810-0700")
@StaticMetamodel(CommunicationEvent.class)
public class CommunicationEvent_ extends BasePersistentModel_ {
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
