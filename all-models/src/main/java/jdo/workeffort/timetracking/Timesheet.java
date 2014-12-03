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

	private List<TimeEntry>		entries;

	private PartyRole			hoursFor;

	private List<TimesheetRole>	involving;

	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	@OneToMany
	public List<TimeEntry> getEntries() {
		return entries;
	}

	@ManyToOne
	public PartyRole getHoursFor() {
		return hoursFor;
	}

	@OneToMany
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
