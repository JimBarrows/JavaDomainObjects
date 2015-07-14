package jdo.workeffort.model.association;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;
import jdo.workeffort.model.WorkEffort;

@Entity
public class WorkEfforAssociation extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	@ManyToOne
	private WorkEffort			associatedFrom;
	@ManyToOne
	private WorkEffort			associatedTo;
	@Embedded
	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	
	public WorkEffort getAssociatedFrom() {
		return associatedFrom;
	}

	
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
