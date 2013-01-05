package mbmp.request.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Party;
import mbmp.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2013-01-04T22:11:23.089-0700")
@StaticMetamodel(RespondingParty.class)
public class RespondingParty_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<RespondingParty, ContactMechanism> contactMechanism;
	public static volatile SingularAttribute<RespondingParty, Date> dateSent;
	public static volatile SingularAttribute<RespondingParty, Party> party;
}
