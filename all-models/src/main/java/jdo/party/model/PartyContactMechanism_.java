package jdo.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.DateTimeRange;
import jdo.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2014-12-24T16:34:41.481-0700")
@StaticMetamodel(PartyContactMechanism.class)
public class PartyContactMechanism_ {
	public static volatile SingularAttribute<PartyContactMechanism, DateTimeRange> dateTimeRange;
	public static volatile SingularAttribute<PartyContactMechanism, String> comment;
	public static volatile SingularAttribute<PartyContactMechanism, Party> mechanismToContact;
	public static volatile SingularAttribute<PartyContactMechanism, PartyRole> specifiedFor;
	public static volatile SingularAttribute<PartyContactMechanism, ContactMechanism> specifiedVia;
	public static volatile ListAttribute<PartyContactMechanism, PartyContactMechanismPurpose> usedForThePurposeOf;
	public static volatile SingularAttribute<PartyContactMechanism, Boolean> solicitable;
}
