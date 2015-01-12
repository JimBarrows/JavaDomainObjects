package jdo.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.communication.CaseRole;
import jdo.party.model.communication.CommunicationEventRole;
import jdo.party.model.facility.FacilityRole;

@Generated(value="Dali", date="2015-01-12T06:42:40.936-0700")
@StaticMetamodel(Party.class)
public class Party_ extends BasePersistentModel_ {
	public static volatile ListAttribute<Party, PartyRole> actingAs;
	public static volatile ListAttribute<Party, CaseRole> caseRolesInvolvedIn;
	public static volatile ListAttribute<Party, PartyClassification> classifiedInto;
	public static volatile ListAttribute<Party, PartyContactMechanism> contactedVia;
	public static volatile ListAttribute<Party, CommunicationEventRole> eventRolesInvolvedIn;
	public static volatile ListAttribute<Party, FacilityRole> involvedInFacilityRole;
	public static volatile ListAttribute<Party, PartyPostalAddress> residingAt;
	public static volatile ListAttribute<Party, FacilityRole> involvedInFacilityRole;
	public static volatile ListAttribute<Party, PartyPostalAddress> residingAt;
}
