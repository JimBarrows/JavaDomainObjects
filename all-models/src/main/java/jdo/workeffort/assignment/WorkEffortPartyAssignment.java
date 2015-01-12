package jdo.workeffort.assignment;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;
import jdo.party.model.Party;
import jdo.party.model.facility.Facility;
import jdo.shipment.model.ShipmentItem;

@Entity
public class WorkEffortPartyAssignment extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@NotNull
	@ManyToOne
	private Party				assigned;

	@ManyToOne
	private Facility			assignedAt;

	@Lob
	private String				comment;

	@ManyToOne
	private WorkEffortRoleType	describedBy;

	@OneToMany
	private List<ShipmentItem>	billingForShipmentItem;
	
	public List<ShipmentItem> getBillingForShipmentItem() {
		return billingForShipmentItem;
	}

	public void setBillingForShipmentItem(List<ShipmentItem> billingFor) {
		this.billingForShipmentItem = billingFor;
	}

	public Party getAssigned() {
		return assigned;
	}

	public Facility getAssignedAt() {
		return assignedAt;
	}

	public String getComment() {
		return comment;
	}

	public WorkEffortRoleType getDescribedBy() {
		return describedBy;
	}

	public void setAssigned(Party assigned) {
		this.assigned = assigned;
	}

	public void setAssignedAt(Facility assignedAt) {
		this.assignedAt = assignedAt;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setDescribedBy(WorkEffortRoleType describedBy) {
		this.describedBy = describedBy;
	}

}
