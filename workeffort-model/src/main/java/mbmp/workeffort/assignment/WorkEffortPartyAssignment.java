package mbmp.workeffort.assignment;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import mbmp.model.BasePersistentModel;
import mbmp.party.model.Party;
import mbmp.party.model.facility.Facility;

@Entity
public class WorkEffortPartyAssignment extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Party assigned;
	
	private Facility assignedAt;
	
	private String comment;
	
	private WorkEffortRoleType describedBy;

	

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