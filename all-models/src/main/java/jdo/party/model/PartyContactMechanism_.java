package jdo.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.contactmechanism.ContactMechanism;

@Generated(value="Dali", date="2014-11-07T22:13:42.921-0700")
@StaticMetamodel(PartyContactMechanism.class)
public class PartyContactMechanism_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PartyContactMechanism, String> comment;
	public static volatile SingularAttribute<PartyContactMechanism, Party> mechanismToContact;
	public static volatile SingularAttribute<PartyContactMechanism, PartyRole> specifiedFor;
	public static volatile SingularAttribute<PartyContactMechanism, ContactMechanism> specifiedVia;
	public static volatile ListAttribute<PartyContactMechanism, PartyContactMechanismPurpose> usedForThePurposeOf;
	public static volatile SingularAttribute<PartyContactMechanism, Boolean> solicitable;
}
