package jdo.party.model.communication;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.workeffort.WorkEffort;

@Entity
public class CommunicationEventWorkEffort extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Lob
	private String description;

	@ManyToOne
	private WorkEffort effortFor;

	@ManyToOne
	private CommunicationEvent eventFrom;

	public String getDescription() {
		return description;
	}

	public WorkEffort getEffortFor() {
		return effortFor;
	}

	@ManyToOne
	public CommunicationEvent getEventFrom() {
		return eventFrom;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setEffortFor(WorkEffort effortFor) {
		this.effortFor = effortFor;
	}

	public void setEventFrom(CommunicationEvent eventFrom) {
		this.eventFrom = eventFrom;
	}

}
