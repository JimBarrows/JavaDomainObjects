package jdo.workeffort.model.association;

import jdo.fields.DateTimeRange;
import jdo.model.PersistentEntity;
import jdo.workeffort.model.WorkEffort;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class WorkEfforAssociation extends PersistentEntity {

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
