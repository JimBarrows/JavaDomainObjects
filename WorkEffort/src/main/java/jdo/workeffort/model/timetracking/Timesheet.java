package jdo.workeffort.model.timetracking;

import jdo.fields.DateTimeRange;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
public class Timesheet extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToMany
	private List<TimeEntry> entries;

	/**
	 * UUID for PartyRole.
	 * 
	 */
	private UUID hoursFor;

	@OneToMany
	private List<TimesheetRole> involving;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public List<TimeEntry> getEntries() {
		return entries;
	}

	public UUID getHoursFor() {
		return hoursFor;
	}

	public List<TimesheetRole> getInvolving() {
		return involving;
	}

	public void setEntries(List<TimeEntry> entries) {
		this.entries = entries;
	}

	public void setHoursFor(UUID hoursFor) {
		this.hoursFor = hoursFor;
	}

	public void setInvolving(List<TimesheetRole> involving) {
		this.involving = involving;
	}

}
