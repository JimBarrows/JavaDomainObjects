package com.nsfwenterprises.biz360.humanresoures.model.position.fulfillment;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;

@Entity
public class PositionStatus extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PositionStatusType type;

	@ManyToOne
	public PositionStatusType getType() {
		return type;
	}

	public void setType(PositionStatusType type) {
		this.type = type;
	}

}
