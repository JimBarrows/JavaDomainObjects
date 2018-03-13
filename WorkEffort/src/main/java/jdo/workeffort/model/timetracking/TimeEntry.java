package jdo.workeffort.model.timetracking;

import jdo.fields.DateTimeRange;
import jdo.model.PersistentEntity;
import jdo.workeffort.model.WorkEffort;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class TimeEntry extends PersistentEntity {

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
