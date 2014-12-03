package jdo.workeffort.timetracking;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.party.model.Party;

@Entity
public class TimesheetRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private Party				involving;

	private TimeSheetRoleType	type;

	@ManyToOne
	public Party getInvolving() {
		return involving;
	}

	@ManyToOne
	public TimeSheetRoleType getType() {
		return type;
	}

	public void setInvolving(Party involving) {
		this.involving = involving;
	}

	public void setType(TimeSheetRoleType type) {
		this.type = type;
	}
}
