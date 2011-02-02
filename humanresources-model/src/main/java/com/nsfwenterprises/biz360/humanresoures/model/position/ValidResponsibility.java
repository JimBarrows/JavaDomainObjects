package com.nsfwenterprises.biz360.humanresoures.model.position;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.humanresoures.model.position.type.PositionType;
import com.nsfwenterprises.biz360.model.BaseDateRangeModel;

@Entity
public class ValidResponsibility extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PositionType associatedWith;
	
	private String comment;
	
	private ResponsibilityType definedBy;

	@ManyToOne
	public PositionType getAssociatedWith() {
		return associatedWith;
	}

	@Lob
	public String getComment() {
		return comment;
	}

	@ManyToOne
	public ResponsibilityType getDefinedBy() {
		return definedBy;
	}

	public void setAssociatedWith(PositionType associatedWith) {
		this.associatedWith = associatedWith;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setDefinedBy(ResponsibilityType definedBy) {
		this.definedBy = definedBy;
	}

}
