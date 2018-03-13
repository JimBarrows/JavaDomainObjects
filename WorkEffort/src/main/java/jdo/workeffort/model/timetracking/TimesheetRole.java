package jdo.workeffort.model.timetracking;

import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class TimesheetRole extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID of the Party.
	 * 
	 */
	private UUID involving;

	@ManyToOne
	private TimeSheetRoleType type;

	public UUID getInvolving() {
		return involving;
	}

	public TimeSheetRoleType getType() {
		return type;
	}

	public void setInvolving(UUID involving) {
		this.involving = involving;
	}

	public void setType(TimeSheetRoleType type) {
		this.type = type;
	}
}
