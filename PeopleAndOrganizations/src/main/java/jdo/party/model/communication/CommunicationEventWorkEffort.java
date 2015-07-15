package jdo.party.model.communication;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;

@Entity
public class CommunicationEventWorkEffort extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Lob
	private String description;

	/**The UUID for the work effort for this communication event.
	 * 
	 */	
	private UUID effortFor;

	@ManyToOne
	private CommunicationEvent eventFrom;

	public String getDescription() {
		return description;
	}

	public UUID getEffortFor() {
		return effortFor;
	}

	public CommunicationEvent getEventFrom() {
		return eventFrom;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setEffortFor(UUID effortFor) {
		this.effortFor = effortFor;
	}

	public void setEventFrom(CommunicationEvent eventFrom) {
		this.eventFrom = eventFrom;
	}

}
