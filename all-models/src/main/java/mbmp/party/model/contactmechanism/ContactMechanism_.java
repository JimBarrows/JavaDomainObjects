package mbmp.party.model.contactmechanism;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.PartyContactMechanism;
import mbmp.party.model.facility.FacilityContactMechanism;

@Generated(value="Dali", date="2013-01-05T08:07:17.475-0700")
@StaticMetamodel(ContactMechanism.class)
public class ContactMechanism_ extends BasePersistentModel_ {
	public static volatile ListAttribute<ContactMechanism, FacilityContactMechanism> usedByFacilities;
	public static volatile ListAttribute<ContactMechanism, PartyContactMechanism> usedByParties;
}
