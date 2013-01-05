package mbmp.party.model.communication;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-05T08:07:17.352-0700")
@StaticMetamodel(CommunicationEventRole.class)
public class CommunicationEventRole_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<CommunicationEventRole, CommunicationEventRoleType> describedBy;
	public static volatile SingularAttribute<CommunicationEventRole, Party> forParty;
	public static volatile SingularAttribute<CommunicationEventRole, CommunicationEvent> of;
	public static volatile SingularAttribute<CommunicationEventRole, CommunicationEventRoleType> type;
}
