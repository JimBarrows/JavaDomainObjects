package mbmp.workeffort;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.order.model.WorkOrderItem;
import mbmp.party.model.facility.Facility;
import mbmp.product.model.storage.InventoryItem;
import mbmp.requirement.model.Requirement;
import mbmp.workeffort.assignment.WorkEffortPartyAssignment;
import mbmp.workeffort.association.WorkEfforAssociation;
import mbmp.workeffort.inventory.WorkEffortInvenotryAssignment;
import mbmp.workeffort.timetracking.TimeEntry;
import mbmp.workeffort.type.WorkEffortType;

@Generated(value="Dali", date="2014-11-07T06:11:39.850-0700")
@StaticMetamodel(WorkEffort.class)
public class WorkEffort_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<WorkEffort, Date> actualCompletionDate;
	public static volatile SingularAttribute<WorkEffort, Date> actualStartDate;
	public static volatile ListAttribute<WorkEffort, WorkEffortPartyAssignment> assignedVia;
	public static volatile ListAttribute<WorkEffort, InventoryItem> deliverableProduced;
	public static volatile SingularAttribute<WorkEffort, String> description;
	public static volatile ListAttribute<WorkEffort, WorkEfforAssociation> fromAssociatedWith;
	public static volatile ListAttribute<WorkEffort, Requirement> fulfillsRequirement;
	public static volatile ListAttribute<WorkEffort, WorkOrderItem> fullfillsWorkOderItems;
	public static volatile ListAttribute<WorkEffort, WorkEffortInvenotryAssignment> inNeedOf;
	public static volatile ListAttribute<WorkEffort, InventoryItem> inventoryProduced;
	public static volatile SingularAttribute<WorkEffort, Facility> performedAt;
	public static volatile ListAttribute<WorkEffort, WorkEffort> redoneVia;
	public static volatile SingularAttribute<WorkEffort, Date> scheduledCompletionDate;
	public static volatile SingularAttribute<WorkEffort, Date> scheduledStartDate;
	public static volatile SingularAttribute<WorkEffort, String> specialTerms;
	public static volatile ListAttribute<WorkEffort, WorkEfforAssociation> toAssociatedWith;
	public static volatile ListAttribute<WorkEffort, TimeEntry> trackedVia;
	public static volatile SingularAttribute<WorkEffort, WorkEffortType> type;
	public static volatile SingularAttribute<WorkEffort, WorkEffort> versionOf;
	public static volatile SingularAttribute<WorkEffort, Long> actualHours;
	public static volatile SingularAttribute<WorkEffort, Long> estimatedHours;
	public static volatile SingularAttribute<WorkEffort, String> name;
	public static volatile SingularAttribute<WorkEffort, BigDecimal> totalDollarsAllowed;
	public static volatile SingularAttribute<WorkEffort, Long> totalHoursAllowed;
}
