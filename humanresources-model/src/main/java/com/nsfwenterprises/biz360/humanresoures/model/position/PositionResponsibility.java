package com.nsfwenterprises.biz360.humanresoures.model.position;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;

@Entity
public class PositionResponsibility extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Position associatedWith;
	
	private String comment;
	
	private ResponsibilityType type;

	@ManyToOne
	public Position getAssociatedWith() {
		return associatedWith;
	}

	public String getComment() {
		return comment;
	}

	@ManyToOne
	public ResponsibilityType getType() {
		return type;
	}

	public void setAssociatedWith(Position associatedWith) {
		this.associatedWith = associatedWith;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setType(ResponsibilityType type) {
		this.type = type;
	}

}
