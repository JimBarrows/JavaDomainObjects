package jdo.request.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.Party;
import jdo.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2014-12-24T16:23:57.609-0700")
@StaticMetamodel(RespondingParty.class)
public class RespondingParty_ {
	public static volatile SingularAttribute<RespondingParty, ContactMechanism> contactMechanism;
	public static volatile SingularAttribute<RespondingParty, Date> dateSent;
	public static volatile SingularAttribute<RespondingParty, Party> party;
}
