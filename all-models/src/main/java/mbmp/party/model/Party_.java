package mbmp.party.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.communication.CaseRole;
import mbmp.party.model.communication.CommunicationEventRole;
import mbmp.party.model.facility.FacilityRole;

@Generated(value="Dali", date="2013-01-04T22:11:22.050-0700")
@StaticMetamodel(Party.class)
public class Party_ extends BasePersistentModel_ {
	public static volatile ListAttribute<Party, PartyRole> actingAs;
	public static volatile ListAttribute<Party, CaseRole> caseRolesInvolvedIn;
	public static volatile ListAttribute<Party, PartyClassification> classifiedInto;
	public static volatile ListAttribute<Party, PartyContactMechanism> contactedVia;
	public static volatile ListAttribute<Party, CommunicationEventRole> eventRolesInvolvedIn;
	public static volatile ListAttribute<Party, FacilityRole> involvedInFacilityRole;
	public static volatile ListAttribute<Party, PartyPostalAddress> residingAt;
}
