package jdo.workeffort.model.timetracking;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;
import jdo.workeffort.model.WorkEffort;

@Entity
public class TimeEntry extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Lob
	private String				comment;

	@ManyToOne
	private WorkEffort			timeSpendOn;

	@Embedded
	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	
	public String getComment() {
		return comment;
	}

	
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
