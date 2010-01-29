package com.nsfwenterprises.biz360.humanresoures.model.skills;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;
import com.nsfwenterprises.biz360.party.model.Person;

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
