package com.nsfwenterprises.biz360.humanresoures.model.position.structure;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.humanresoures.model.position.Position;
import com.nsfwenterprises.biz360.model.BaseDateRangeModel;

@Entity
public class PositionReportingStructure extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String comment;
	
	private Position manager;
	
	private boolean primary;
	
	private Position subordinate;

	public String getComment() {
		return comment;
	}

	@ManyToOne
	public Position getManager() {
		return manager;
	}

	@ManyToOne
	public Position getSubordinate() {
		return subordinate;
	}

	@Column(name="isPrimary")
	public boolean isPrimary() {
		return primary;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setManager(Position manager) {
		this.manager = manager;
	}

	public void setPrimary(boolean primary) {
		this.primary = primary;
	}

	public void setSubordinate(Position subordinate) {
		this.subordinate = subordinate;
	}

}
