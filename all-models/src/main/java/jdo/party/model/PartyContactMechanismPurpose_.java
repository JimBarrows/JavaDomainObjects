package jdo.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BaseDateRangeModel_;
import jdo.party.model.contactmechanism.ContactMechanismPurposeType;

@Generated(value="Dali", date="2014-11-07T22:13:42.927-0700")
@StaticMetamodel(PartyContactMechanismPurpose.class)
public class PartyContactMechanismPurpose_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PartyContactMechanismPurpose, ContactMechanismPurposeType> definedVia;
	public static volatile SingularAttribute<PartyContactMechanismPurpose, PartyContactMechanism> usedWithin;
}
