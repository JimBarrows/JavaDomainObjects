package jdo.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.model.DateTimeRange;
import jdo.party.model.contactmechanism.ContactMechanismPurposeType;

@Generated(value="Dali", date="2014-12-02T20:57:30.287-0700")
@StaticMetamodel(PartyContactMechanismPurpose.class)
public class PartyContactMechanismPurpose_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<PartyContactMechanismPurpose, ContactMechanismPurposeType> definedVia;
	public static volatile SingularAttribute<PartyContactMechanismPurpose, PartyContactMechanism> usedWithin;
	public static volatile SingularAttribute<PartyContactMechanismPurpose, DateTimeRange> dateTimeRange;
}
