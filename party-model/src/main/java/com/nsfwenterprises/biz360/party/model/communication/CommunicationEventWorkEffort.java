package com.nsfwenterprises.biz360.party.model.communication;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
//import com.nsfwenterprises.biz360.workeffort.WorkEffort;

@Entity
public class CommunicationEventWorkEffort extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	

	private String description;
	
//	private WorkEffort effortFor;
	
	private CommunicationEvent eventFrom;

	@Lob
	public String getDescription() {
		return description;
	}
	
/*	@ManyToOne
	public WorkEffort getEffortFor() {
		return effortFor;
	}
*/

	@ManyToOne
	public CommunicationEvent getEventFrom() {
		return eventFrom;
	}

	public void setDescription(String description) {
		this.description = description;
	}

/*	public void setEffortFor(WorkEffort effortFor) {
		this.effortFor = effortFor;
	}
*/

	public void setEventFrom(CommunicationEvent eventFrom) {
		this.eventFrom = eventFrom;
	}

}
