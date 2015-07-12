package jdo.workeffort.assignment;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;

@Entity
public class WorkEffortPartyAssignment extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID of the Party.
	 * 
	 */
	@NotNull
	private UUID assigned;

	/**
	 * UUID of the Facility.
	 * 
	 */
	private UUID assignedAt;

	@Lob
	private String comment;

	@ManyToOne
	private WorkEffortRoleType describedBy;

	/**
	 * UUID of the ShipmentItem.
	 * 
	 */
	private List<UUID> billingForShipmentItem;

	public List<UUID> getBillingForShipmentItem() {
		return billingForShipmentItem;
	}

	public void setBillingForShipmentItem(List<UUID> billingFor) {
		this.billingForShipmentItem = billingFor;
	}

	public UUID getAssigned() {
		return assigned;
	}

	public UUID getAssignedAt() {
		return assignedAt;
	}

	public String getComment() {
		return comment;
	}

	public WorkEffortRoleType getDescribedBy() {
		return describedBy;
	}

	public void setAssigned(UUID assigned) {
		this.assigned = assigned;
	}

	public void setAssignedAt(UUID assignedAt) {
		this.assignedAt = assignedAt;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setDescribedBy(WorkEffortRoleType describedBy) {
		this.describedBy = describedBy;
	}

}
