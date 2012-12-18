package mbmp.party.model.communication;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import mbmp.party.model.Party;

@Generated(value="Dali", date="2011-12-07T19:49:02.094-0700")
@StaticMetamodel(CommunicationEventRole.class)
public class CommunicationEventRole_ {
	public static volatile SingularAttribute<CommunicationEventRole, CommunicationEventRoleType> describedBy;
	public static volatile SingularAttribute<CommunicationEventRole, Party> forParty;
	public static volatile SingularAttribute<CommunicationEventRole, CommunicationEvent> of;
	public static volatile SingularAttribute<CommunicationEventRole, CommunicationEventRoleType> type;
}
