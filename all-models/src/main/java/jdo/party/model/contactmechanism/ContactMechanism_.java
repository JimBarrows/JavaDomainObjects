package jdo.party.model.contactmechanism;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.PartyContactMechanism;
import jdo.party.model.facility.FacilityContactMechanism;

@Generated(value="Dali", date="2014-12-24T17:30:47.606-0700")
@StaticMetamodel(ContactMechanism.class)
public class ContactMechanism_ extends BasePersistentModel_ {
	public static volatile ListAttribute<ContactMechanism, FacilityContactMechanism> usedByFacilities;
	public static volatile ListAttribute<ContactMechanism, PartyContactMechanism> usedByParties;
}
