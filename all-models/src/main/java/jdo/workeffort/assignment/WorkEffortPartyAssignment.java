package jdo.workeffort.assignment;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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

	private Party				assigned;

	private Facility			assignedAt;

	private String				comment;

	private WorkEffortRoleType	describedBy;

	private List<ShipmentItem>	billingForShipmentItem;

	@OneToMany
	public List<ShipmentItem> getBillingForShipmentItem() {
		return billingForShipmentItem;
	}

	public void setBillingForShipmentItem(List<ShipmentItem> billingFor) {
		this.billingForShipmentItem = billingFor;
	}

	@ManyToOne
	public Party getAssigned() {
		return assigned;
	}

	@ManyToOne
	public Facility getAssignedAt() {
		return assignedAt;
	}

	@Lob
	public String getComment() {
		return comment;
	}

	@ManyToOne
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
