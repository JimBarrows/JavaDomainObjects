package mbmp.workeffort.timetracking;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import mbmp.model.BaseDateRangeModel;
import mbmp.party.model.role.Worker;

@Entity
public class Timesheet extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<TimeEntry> entries;
	
	private Worker hoursFor;
	
	private List<TimesheetRole> involving;

	@OneToMany
	public List<TimeEntry> getEntries() {
		return entries;
	}

	@ManyToOne
	public Worker getHoursFor() {
		return hoursFor;
	}

	@OneToMany
	public List<TimesheetRole> getInvolving() {
		return involving;
	}

	public void setEntries(List<TimeEntry> entries) {
		this.entries = entries;
	}

	public void setHoursFor(Worker hoursFor) {
		this.hoursFor = hoursFor;
	}

	public void setInvolving(List<TimesheetRole> involving) {
		this.involving = involving;
	}
	
}
