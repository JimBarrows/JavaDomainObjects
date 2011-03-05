package com.nsfwenterprises.biz360.workeffort.timetracking;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;
import com.nsfwenterprises.biz360.party.model.PartyRole;

@Entity
public class Timesheet extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<TimeEntry> entries;
	
	private PartyRole hoursFor;
	
	private List<TimesheetRole> involving;

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
