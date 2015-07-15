package jdo.workeffort.model;

import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;

@Entity
public class WorkEffortStatus extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ZonedDateTime changedOn;

	@ManyToOne
	private WorkEffortStatusType type;

	public ZonedDateTime getChangedOn() {
		return changedOn;
	}

	public WorkEffortStatusType getType() {
		return type;
	}

	public void setChangedOn(ZonedDateTime changedOn) {
		this.changedOn = changedOn;
	}

	public void setType(WorkEffortStatusType type) {
		this.type = type;
	}

}
