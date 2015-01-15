package jdo.workeffort;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.model.BasePersistentModel;

@Entity
public class WorkEffortStatus extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;
	@Temporal(TemporalType.TIMESTAMP)
	private Date					changedon;
	@ManyToOne
	private WorkEffortStatusType	type;

	
	public Date getChangedon() {
		return changedon;
	}

	
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
