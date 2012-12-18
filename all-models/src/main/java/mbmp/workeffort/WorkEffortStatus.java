package mbmp.workeffort;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import mbmp.model.BasePersistentModel;

@Entity
public class WorkEffortStatus extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Date changedon;
	
	private WorkEffortStatusType type;

	@Temporal(TemporalType.TIMESTAMP)
	public Date getChangedon() {
		return changedon;
	}

	@ManyToOne
	public WorkEffortStatusType getType() {
		return type;
	}

	public void setChangedon(Date changedon) {
		this.changedon = changedon;
	}

	public void setType(WorkEffortStatusType type) {
		this.type = type;
	}

}
