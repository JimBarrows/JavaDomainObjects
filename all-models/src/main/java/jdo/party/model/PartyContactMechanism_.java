package jdo.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.contactmechanism.ContactMechanism;

@Generated(value = "Dali", date = "2014-12-02T21:35:29.138-0700")
@StaticMetamodel(PartyContactMechanism.class)
public class PartyContactMechanism_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PartyContactMechanism, String>						comment;
	public static volatile SingularAttribute<PartyContactMechanism, Party>						mechanismToContact;
	public static volatile SingularAttribute<PartyContactMechanism, PartyRole>					specifiedFor;
	public static volatile SingularAttribute<PartyContactMechanism, ContactMechanism>			specifiedVia;
	public static volatile ListAttribute<PartyContactMechanism, PartyContactMechanismPurpose>	usedForThePurposeOf;
	public static volatile SingularAttribute<PartyContactMechanism, Boolean>					solicitable;
	public static volatile SingularAttribute<PartyContactMechanism, DateTimeRange>				dateTimeRange;
}
