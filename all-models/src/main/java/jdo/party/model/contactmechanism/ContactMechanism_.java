package jdo.party.model.contactmechanism;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.party.model.PartyContactMechanism;
import jdo.party.model.facility.FacilityContactMechanism;

@Generated(value="Dali", date="2014-12-24T16:23:56.248-0700")
@StaticMetamodel(ContactMechanism.class)
public class ContactMechanism_ {
	public static volatile ListAttribute<ContactMechanism, FacilityContactMechanism> usedByFacilities;
	public static volatile ListAttribute<ContactMechanism, PartyContactMechanism> usedByParties;
}
