package jdo.humanresoures.model.skills;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BaseDateRangeModel;
import jdo.party.model.Person;

@Entity
public class PersonTraining extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Person receivedBy;
	
	private TrainingClassType type;

	public Person getReceivedBy() {
		return receivedBy;
	}

	@ManyToOne
	public TrainingClassType getType() {
		return type;
	}

	public void setReceivedBy(Person receivedBy) {
		this.receivedBy = receivedBy;
	}

	public void setType(TrainingClassType type) {
		this.type = type;
	}

}
