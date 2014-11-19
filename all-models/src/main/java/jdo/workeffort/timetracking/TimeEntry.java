package jdo.workeffort.timetracking;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import jdo.model.BaseDateRangeModel;
import jdo.workeffort.WorkEffort;

@Entity
public class TimeEntry extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String comment;
	
	private WorkEffort timeSpendOn;

	@Lob
	public String getComment() {
		return comment;
	}

	@ManyToOne
	public WorkEffort getTimeSpendOn() {
		return timeSpendOn;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setTimeSpendOn(WorkEffort timeSpendOn) {
		this.timeSpendOn = timeSpendOn;
	}

}