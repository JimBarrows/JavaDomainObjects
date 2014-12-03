package jdo.workeffort;

import java.util.Date;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.fields.Money;
import jdo.model.BasePersistentModel;
import jdo.order.model.WorkOrderItem;
import jdo.party.model.facility.Facility;
import jdo.product.model.storage.InventoryItem;
import jdo.requirement.model.Requirement;
import jdo.workeffort.assignment.WorkEffortPartyAssignment;
import jdo.workeffort.association.WorkEfforAssociation;
import jdo.workeffort.inventory.WorkEffortInvenotryAssignment;
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
	private static final long					serialVersionUID	= 1L;

	private Date								actualCompletionDate;

	private long								actualHours;

	private Date								actualStartDate;

	private List<WorkEffortPartyAssignment>		assignedVia;

	private List<InventoryItem>					deliverableProduced;

	private String								description;

	private long								estimatedHours;

	private List<WorkEfforAssociation>			fromAssociatedWith;

	private List<Requirement>					fulfillsRequirement;

	private List<WorkOrderItem>					fullfillsWorkOderItems;

	private List<WorkEffortInvenotryAssignment>	inNeedOf;

	private List<InventoryItem>					inventoryProduced;

	private String								name;

	private Facility							performedAt;

	private List<WorkEffort>					redoneVia;

	private Date								scheduledCompletionDate;

	private Date								scheduledStartDate;

	private String								specialTerms;

	private List<WorkEfforAssociation>			toAssociatedWith;

	private Money								totalDollarsAllowed;

	private long								totalHoursAllowed;

	private List<TimeEntry>						trackedVia;

	private WorkEffortType						type;

	private WorkEffort							versionOf;

	@Temporal(TemporalType.DATE)
	public Date getActualCompletionDate() {
		return actualCompletionDate;
	}

	public long getActualHours() {
		return actualHours;
	}

	@Temporal(TemporalType.DATE)
	public Date getActualStartDate() {
		return actualStartDate;
	}

	@OneToMany
	public List<WorkEffortPartyAssignment> getAssignedVia() {
		return assignedVia;
	}

	@OneToMany
	public List<InventoryItem> getDeliverableProduced() {
		return deliverableProduced;
	}

	/**
	 * @return the description
	 */
	@Lob
	public String getDescription() {
		return description;
	}

	/**
	 * @return the estimatedHours
	 */
	public long getEstimatedHours() {
		return estimatedHours;
	}

	@OneToMany(mappedBy = "associatedTo")
	public List<WorkEfforAssociation> getFromAssociatedWith() {
		return fromAssociatedWith;
	}

	@OneToMany
	public List<Requirement> getFulfillsRequirement() {
		return fulfillsRequirement;
	}

	@OneToMany
	public List<WorkOrderItem> getFullfillsWorkOderItems() {
		return fullfillsWorkOderItems;
	}

	@OneToMany
	public List<WorkEffortInvenotryAssignment> getInNeedOf() {
		return inNeedOf;
	}

	@OneToMany
	public List<InventoryItem> getInventoryProduced() {
		return inventoryProduced;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	@ManyToOne
	public Facility getPerformedAt() {
		return performedAt;
	}

	@OneToMany(mappedBy = "versionOf")
	public List<WorkEffort> getRedoneVia() {
		return redoneVia;
	}

	/**
	 * @return the scheduledCompletionDate
	 */
	@Temporal(TemporalType.DATE)
	public Date getScheduledCompletionDate() {
		return scheduledCompletionDate;
	}

	/**
	 * @return the scheduledStartDate
	 */
	@Temporal(TemporalType.DATE)
	public Date getScheduledStartDate() {
		return scheduledStartDate;
	}

	@Lob
	public String getSpecialTerms() {
		return specialTerms;
	}

	@OneToMany(mappedBy = "associatedFrom")
	public List<WorkEfforAssociation> getToAssociatedWith() {
		return toAssociatedWith;
	}

	/**
	 * @return the totalDollarsAllowed
	 */
	@Embedded
	public Money getTotalDollarsAllowed() {
		return totalDollarsAllowed;
	}

	/**
	 * @return the totalHoursAllowed
	 */
	public long getTotalHoursAllowed() {
		return totalHoursAllowed;
	}

	@OneToMany
	public List<TimeEntry> getTrackedVia() {
		return trackedVia;
	}

	@ManyToOne
	public WorkEffortType getType() {
		return type;
	}

	@ManyToOne
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

	public void setDeliverableProduced(List<InventoryItem> deliverableProduced) {
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

	public void setFulfillsRequirement(List<Requirement> fulfillsRequirement) {
		this.fulfillsRequirement = fulfillsRequirement;
	}

	public void setFullfillsWorkOderItems(List<WorkOrderItem> fullfillsWorkOderItems) {
		this.fullfillsWorkOderItems = fullfillsWorkOderItems;
	}

	public void setInNeedOf(List<WorkEffortInvenotryAssignment> inNeedOf) {
		this.inNeedOf = inNeedOf;
	}

	public void setInventoryProduced(List<InventoryItem> inventoryProduced) {
		this.inventoryProduced = inventoryProduced;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void setPerformedAt(Facility performedAt) {
		this.performedAt = performedAt;
	}

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