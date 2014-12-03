package jdo.workeffort.timetracking;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.workeffort.WorkEffort;

@Entity
public class TimeEntry extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String comment;
	
	private WorkEffort timeSpendOn;
	
	private DateTimeRange	dateTimeRange	= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

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
