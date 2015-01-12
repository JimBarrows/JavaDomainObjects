package jdo.workeffort.timetracking;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyRole;

@Entity
public class Timesheet extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@OneToMany
	private List<TimeEntry>		entries;

	@ManyToOne
	private PartyRole			hoursFor;

	@OneToMany
	private List<TimesheetRole>	involving;

	@Embedded
	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	
	public List<TimeEntry> getEntries() {
		return entries;
	}

	
	public PartyRole getHoursFor() {
		return hoursFor;
	}
	
	public List<TimesheetRole> getInvolving() {
		return involving;
	}

	public void setEntries(List<TimeEntry> entries) {
		this.entries = entries;
	}

	public void setHoursFor(PartyRole hoursFor) {
		this.hoursFor = hoursFor;
	}

	public void setInvolving(List<TimesheetRole> involving) {
		this.involving = involving;
	}

}
