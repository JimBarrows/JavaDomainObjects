package jdo.party.model.communication;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;

@Generated(value="Dali", date="2014-12-24T17:30:47.568-0700")
@StaticMetamodel(CommunicationEventRole.class)
public class CommunicationEventRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<CommunicationEventRole, CommunicationEventRoleType> describedBy;
	public static volatile SingularAttribute<CommunicationEventRole, Party> forParty;
	public static volatile SingularAttribute<CommunicationEventRole, CommunicationEvent> of;
	public static volatile SingularAttribute<CommunicationEventRole, CommunicationEventRoleType> type;
}
