package jdo.workeffort.assignment;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;
import jdo.party.model.Party;
import jdo.party.model.facility.Facility;
import jdo.shipment.model.ShipmentItem;

@Generated(value="Dali", date="2015-01-12T16:01:17.615-0700")
@StaticMetamodel(WorkEffortPartyAssignment.class)
public class WorkEffortPartyAssignment_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WorkEffortPartyAssignment, Party> assigned;
	public static volatile SingularAttribute<WorkEffortPartyAssignment, Facility> assignedAt;
	public static volatile SingularAttribute<WorkEffortPartyAssignment, String> comment;
	public static volatile SingularAttribute<WorkEffortPartyAssignment, WorkEffortRoleType> describedBy;
	public static volatile ListAttribute<WorkEffortPartyAssignment, ShipmentItem> billingForShipmentItem;
}
