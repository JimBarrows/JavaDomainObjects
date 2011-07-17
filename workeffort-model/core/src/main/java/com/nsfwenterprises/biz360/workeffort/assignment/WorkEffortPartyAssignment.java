package mbmp.workeffort.assignment;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import mbmp.model.BasePersistentModel;
import mbmp.party.model.Party;
import mbmp.party.model.facility.Facility;
import mbmp.workeffort.rate.WorkEffortAssignmentRate;

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

	private List<WorkEffortAssignmentRate> rateOf;

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

	@OneToMany
	public List<WorkEffortAssignmentRate> getRateOf() {
		return rateOf;
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
	
	public void setRateOf(List<WorkEffortAssignmentRate> rateOf) {
		this.rateOf = rateOf;
	}
	

}
