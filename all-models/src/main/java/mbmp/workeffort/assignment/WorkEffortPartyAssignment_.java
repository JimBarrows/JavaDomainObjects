package mbmp.workeffort.assignment;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Party;
import mbmp.party.model.facility.Facility;
import mbmp.shipment.model.ShipmentItem;

@Generated(value="Dali", date="2013-01-04T22:11:23.478-0700")
@StaticMetamodel(WorkEffortPartyAssignment.class)
public class WorkEffortPartyAssignment_ extends BasePersistentModel_ {
	public static volatile ListAttribute<WorkEffortPartyAssignment, ShipmentItem> billingForShipmentItem;
	public static volatile SingularAttribute<WorkEffortPartyAssignment, Party> assigned;
	public static volatile SingularAttribute<WorkEffortPartyAssignment, Facility> assignedAt;
	public static volatile SingularAttribute<WorkEffortPartyAssignment, String> comment;
	public static volatile SingularAttribute<WorkEffortPartyAssignment, WorkEffortRoleType> describedBy;
}
