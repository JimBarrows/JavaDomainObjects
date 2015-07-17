package jdo.workeffort.model;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;

import jdo.fields.Money;
import jdo.model.BasePersistentModel;
import jdo.workeffort.model.assignment.WorkEffortPartyAssignment;
import jdo.workeffort.model.association.WorkEfforAssociation;
import jdo.workeffort.model.inventory.WorkEffortInventoryAssignment;
import jdo.workeffort.model.timetracking.TimeEntry;
import jdo.workeffort.model.type.WorkEffortType;

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
	
	private LocalDate actualCompletionLocalDate;

	private Duration actualHours;

	private LocalDate actualStartLocalDate;

	@OneToMany
	private List<WorkEffortPartyAssignment> assignedVia;

	/**
	 * UUID of the InventoryItem.
	 * 
	 */
	@ElementCollection
	private List<UUID> deliverableProduced;

	@Lob
	private String description;

	private Duration estimatedHours;

	@OneToMany(mappedBy = "associatedTo")
	private List<WorkEfforAssociation> fromAssociatedWith;

	/**
	 * UUID of the Requirement.
	 * 
	 */
	@ElementCollection
	private List<UUID> fulfillsRequirement;

	/**
	 * UUID of the WorkOrderItem.
	 * 
	 */
	@ElementCollection
	private List<UUID> fullfillsWorkOderItems;

	@OneToMany
	private List<WorkEffortInventoryAssignment> inNeedOf;

	/**
	 * UUID of the InventoryItem.
	 * 
	 */
	@ElementCollection
	private List<UUID> inventoryProduced;

	@NotBlank
	private String name;

	/**
	 * UUID of the Facility.
	 * 
	 */
	private UUID performedAt;

	@OneToMany(mappedBy = "versionOf")
	private List<WorkEffort> redoneVia;
	
	private LocalDate scheduledCompletionLocalDate;

	private LocalDate scheduledStartLocalDate;

	@Lob
	private String specialTerms;

	@OneToMany(mappedBy = "associatedFrom")
	private List<WorkEfforAssociation> toAssociatedWith;

	@Embedded
	private Money totalDollarsAllowed;

	private Duration totalHoursAllowed;

	@OneToMany
	private List<TimeEntry> trackedVia;

	@ManyToOne
	private WorkEffortType type;

	@ManyToOne
	private WorkEffort versionOf;

	public LocalDate getActualCompletionLocalDate() {
		return actualCompletionLocalDate;
	}

	public Duration getActualHours() {
		return actualHours;
	}

	public LocalDate getActualStartLocalDate() {
		return actualStartLocalDate;
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
	public Duration getEstimatedHours() {
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
	 * @return the scheduledCompletionLocalDate
	 */
	public LocalDate getScheduledCompletionLocalDate() {
		return scheduledCompletionLocalDate;
	}

	/**
	 * @return the scheduledStartLocalDate
	 */
	public LocalDate getScheduledStartLocalDate() {
		return scheduledStartLocalDate;
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
	public Duration getTotalHoursAllowed() {
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

	public void setActualCompletionLocalDate(LocalDate actualCompletionLocalDate) {
		this.actualCompletionLocalDate = actualCompletionLocalDate;
	}

	public void setActualHours(Duration actualHours) {
		this.actualHours = actualHours;
	}

	public void setActualStartLocalDate(LocalDate actualStartLocalDate) {
		this.actualStartLocalDate = actualStartLocalDate;
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
	public void setEstimatedHours(Duration estimatedHours) {
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

	public void setRedoneVia(List<WorkEffort> redoneVia) {
		this.redoneVia = redoneVia;
	}

	/**
	 * @param scheduledCompletionLocalDate
	 *            the scheduledCompletionLocalDate to set
	 */
	public void setScheduledCompletionLocalDate(LocalDate scheduledCompletionLocalDate) {
		this.scheduledCompletionLocalDate = scheduledCompletionLocalDate;
	}

	/**
	 * @param scheduledStartLocalDate
	 *            the scheduledStartLocalDate to set
	 */
	public void setScheduledStartLocalDate(LocalDate scheduledStartLocalDate) {
		this.scheduledStartLocalDate = scheduledStartLocalDate;
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
	public void setTotalHoursAllowed(Duration totalHoursAllowed) {
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