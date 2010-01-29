package com.nsfwenterprises.biz360.party.model.communication;

import javax.persistence.Entity;

import org.hibernate.validator.NotNull;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;

@Entity
public class CommunicationEventPurpose extends BaseDateRangeModel {

	private static final long serialVersionUID = 1L;
	
	private CommunicationEventPurposeType type;

	@NotNull
	public CommunicationEventPurposeType getType() {
		return type;
	}

	public void setType(CommunicationEventPurposeType type) {
		this.type = type;
	}
}
