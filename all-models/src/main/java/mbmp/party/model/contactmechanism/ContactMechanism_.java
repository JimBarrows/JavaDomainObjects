package mbmp.party.model.contactmechanism;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import mbmp.party.model.PartyContactMechanism;
import mbmp.party.model.facility.FacilityContactMechanism;

@Generated(value="Dali", date="2011-12-07T19:49:02.098-0700")
@StaticMetamodel(ContactMechanism.class)
public class ContactMechanism_ {
	public static volatile ListAttribute<ContactMechanism, FacilityContactMechanism> usedByFacilities;
	public static volatile ListAttribute<ContactMechanism, PartyContactMechanism> usedByParties;
}
