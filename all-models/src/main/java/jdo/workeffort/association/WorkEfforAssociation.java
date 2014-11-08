package jdo.workeffort.association;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BaseDateRangeModel;
import jdo.workeffort.WorkEffort;

@Entity
public class WorkEfforAssociation extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private WorkEffort associatedFrom;
	
	private WorkEffort associatedTo;

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
