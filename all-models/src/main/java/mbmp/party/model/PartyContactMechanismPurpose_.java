package mbmp.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BaseDateRangeModel_;
import mbmp.party.model.contactmechanism.ContactMechanismPurposeType;

@Generated(value="Dali", date="2013-01-05T07:41:45.958-0700")
@StaticMetamodel(PartyContactMechanismPurpose.class)
public class PartyContactMechanismPurpose_ extends BaseDateRangeModel_ {
	public static volatile SingularAttribute<PartyContactMechanismPurpose, ContactMechanismPurposeType> definedVia;
	public static volatile SingularAttribute<PartyContactMechanismPurpose, PartyContactMechanism> usedWithin;
}
