package jdo.workeffort;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

import jdo.fields.Money;
import jdo.model.BasePersistentModel;
import jdo.workeffort.assignment.WorkEffortPartyAssignment;
import jdo.workeffort.association.WorkEfforAssociation;
import jdo.workeffort.inventory.WorkEffortInventoryAssignment;
import jdo.workeffort.timetracking.TimeEntry;
import jdo.workeffort.type.WorkEffortType;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:39 AM
 * @see "Data Model Resource Book Volume 1 Figure 2.13, page 64"
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class WorkEffort extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date actualCompletionDate;

	@Min(0)
	private long actualHours;

	@Temporal(TemporalType.DATE)
	private Date actualStartDate;

	@OneToMany
	private List<WorkEffortPartyAssignment> assignedVia;

	/**
	 * UUID of the InventoryItem.
	 * 
	 */
	private List<UUID> deliverableProduced;

	@Lob
	private String description;

	@Min(0)
	private long estimatedHours;

	@OneToMany(mappedBy = "associatedTo")
	private List<WorkEfforAssociation> fromAssociatedWith;

	/**
	 * UUID of the Requirement.
	 * 
	 */
	private List<UUID> fulfillsRequirement;

	/**
	 * UUID of the WorkOrderItem.
	 * 
	 */
	private List<UUID> fullfillsWorkOderItems;

	@OneToMany
	private List<WorkEffortInventoryAssignment> inNeedOf;

	/**
	 * UUID of the InventoryItem.
	 * 
	 */
	private List<UUID> inventoryProduced;

	@NotEmpty
	private String name;

	/**
	 * UUID of the Facility.
	 * 
	 */
	private UUID performedAt;

	@OneToMany(mappedBy = "versionOf")
	private List<WorkEffort> redoneVia;

	@Temporal(TemporalType.DATE)
	private Date scheduledCompletionDate;

	@Temporal(TemporalType.DATE)
	private Date scheduledStartDate;

	@Lob
	private String specialTerms;

	@OneToMany(mappedBy = "associatedFrom")
	private List<WorkEfforAssociation> toAssociatedWith;

	@Embedded
	private Money totalDollarsAllowed;

	@Min(0)
	private long totalHoursAllowed;

	@OneToMany
	private List<TimeEntry> trackedVia;

	@ManyToOne
	private WorkEffortType type;

	@ManyToOne
	private WorkEffort versionOf;

	public Date getActualCompletionDate() {
		return actualCompletionDate;
	}

	public long getActualHours() {
		return actualHours;
	}

	public Date getActualStartDate() {
		return actualStartDate;
	}

	public List<WorkEffortPartyAssignment> getAssignedVia() {
		return assignedVia;
	}

	public List<UUID> getDeliverableProduced() {
		return deliverableProduced;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the estimatedHours
	 */
	public long getEstimatedHours() {
		return estimatedHours;
	}

	public List<WorkEfforAssociation> getFromAssociatedWith() {
		return fromAssociatedWith;
	}

	public List<UUID> getFulfillsRequirement() {
		return fulfillsRequirement;
	}

	public List<UUID> getFullfillsWorkOderItems() {
		return fullfillsWorkOderItems;
	}

	public List<WorkEffortInventoryAssignment> getInNeedOf() {
		return inNeedOf;
	}

	public List<UUID> getInventoryProduced() {
		return inventoryProduced;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public UUID getPerformedAt() {
		return performedAt;
	}

	public List<WorkEffort> getRedoneVia() {
		return redoneVia;
	}

	/**
	 * @return the scheduledCompletionDate
	 */
	public Date getScheduledCompletionDate() {
		return scheduledCompletionDate;
	}

	/**
	 * @return the scheduledStartDate
	 */
	public Date getScheduledStartDate() {
		return scheduledStartDate;
	}

	public String getSpecialTerms() {
		return specialTerms;
	}

	public List<WorkEfforAssociation> getToAssociatedWith() {
		return toAssociatedWith;
	}

	/**
	 * @return the totalDollarsAllowed
	 */
	public Money getTotalDollarsAllowed() {
		return totalDollarsAllowed;
	}

	/**
	 * @return the totalHoursAllowed
	 */
	public long getTotalHoursAllowed() {
		return totalHoursAllowed;
	}

	public List<TimeEntry> getTrackedVia() {
		return trackedVia;
	}

	public WorkEffortType getType() {
		return type;
	}

	public WorkEffort getVersionOf() {
		return versionOf;
	}

	public void setActualCompletionDate(Date actualCompletionDate) {
		this.actualCompletionDate = actualCompletionDate;
	}

	public void setActualHours(long actualHours) {
		this.actualHours = actualHours;
	}

	public void setActualStartDate(Date actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	public void setAssignedVia(List<WorkEffortPartyAssignment> assignedVia) {
		this.assignedVia = assignedVia;
	}

	public void setDeliverableProduced(List<UUID> deliverableProduced) {
		this.deliverableProduced = deliverableProduced;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param estimatedHours
	 *            the estimatedHours to set
	 */
	public void setEstimatedHours(long estimatedHours) {
		this.estimatedHours = estimatedHours;
	}

	public void setFromAssociatedWith(List<WorkEfforAssociation> fromAssociatedWith) {
		this.fromAssociatedWith = fromAssociatedWith;
	}

	public void setFulfillsRequirement(List<UUID> fulfillsRequirement) {
		this.fulfillsRequirement = fulfillsRequirement;
	}

	public void setFullfillsWorkOderItems(List<UUID> fullfillsWorkOderItems) {
		this.fullfillsWorkOderItems = fullfillsWorkOderItems;
	}

	public void setInNeedOf(List<WorkEffortInventoryAssignment> inNeedOf) {
		this.inNeedOf = inNeedOf;
	}

	public void setInventoryProduced(List<UUID> inventoryProduced) {
		this.inventoryProduced = inventoryProduced;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	// public void setPerformedAt(Facility performedAt) {
	// this.performedAt = performedAt;
	// }

	public void setRedoneVia(List<WorkEffort> redoneVia) {
		this.redoneVia = redoneVia;
	}

	/**
	 * @param scheduledCompletionDate
	 *            the scheduledCompletionDate to set
	 */
	public void setScheduledCompletionDate(Date scheduledCompletionDate) {
		this.scheduledCompletionDate = scheduledCompletionDate;
	}

	/**
	 * @param scheduledStartDate
	 *            the scheduledStartDate to set
	 */
	public void setScheduledStartDate(Date scheduledStartDate) {
		this.scheduledStartDate = scheduledStartDate;
	}

	public void setSpecialTerms(String specialTerms) {
		this.specialTerms = specialTerms;
	}

	public void setToAssociatedWith(List<WorkEfforAssociation> toAssociatedWith) {
		this.toAssociatedWith = toAssociatedWith;
	}

	/**
	 * @param totalDollarsAllowed
	 *            the totalDollarsAllowed to set
	 */
	public void setTotalDollarsAllowed(Money totalDollarsAllowed) {
		this.totalDollarsAllowed = totalDollarsAllowed;
	}

	/**
	 * @param totalHoursAllowed
	 *            the totalHoursAllowed to set
	 */
	public void setTotalHoursAllowed(long totalHoursAllowed) {
		this.totalHoursAllowed = totalHoursAllowed;
	}

	public void setTrackedVia(List<TimeEntry> trackedVia) {
		this.trackedVia = trackedVia;
	}

	public void setType(WorkEffortType type) {
		this.type = type;
	}

	public void setVersionOf(WorkEffort versionOf) {
		this.versionOf = versionOf;
	}

}