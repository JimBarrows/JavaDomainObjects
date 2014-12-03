package jdo.workeffort.association;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.workeffort.WorkEffort;

@Entity
public class WorkEfforAssociation extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private WorkEffort			associatedFrom;

	private WorkEffort			associatedTo;

	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	@ManyToOne
	public WorkEffort getAssociatedFrom() {
		return associatedFrom;
	}

	@ManyToOne
	public WorkEffort getAssociatedTo() {
		return associatedTo;
	}

	public void setAssociatedFrom(WorkEffort associatedFrom) {
		this.associatedFrom = associatedFrom;
	}

	public void setAssociatedTo(WorkEffort associatedTo) {
		this.associatedTo = associatedTo;
	}
}
