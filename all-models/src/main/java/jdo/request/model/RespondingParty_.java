package jdo.request.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;
import jdo.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2014-11-07T22:13:43.461-0700")
@StaticMetamodel(RespondingParty.class)
public class RespondingParty_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<RespondingParty, ContactMechanism> contactMechanism;
	public static volatile SingularAttribute<RespondingParty, Date> dateSent;
	public static volatile SingularAttribute<RespondingParty, Party> party;
}