package com.nsfwenterprises.biz360.humanresoures.model.skills;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;
import com.nsfwenterprises.biz360.party.model.Party;

@Entity
public class PartyQualification extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Party heldBy;
	
	private QualificationType type;

	public Party getHeldBy() {
		return heldBy;
	}

	@ManyToOne
	public QualificationType getType() {
		return type;
	}

	public void setHeldBy(Party heldBy) {
		this.heldBy = heldBy;
	}

	public void setType(QualificationType type) {
		this.type = type;
	}

}
