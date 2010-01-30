package com.nsfwenterprises.biz360.humanresoures.model.position.type;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.validator.Max;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;

@Entity
public class PositionTypeClass extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PositionType forPositionType;
	
	private int standardHoursePerWeek;
	
	private PositionClassificationType type;

	@ManyToOne
	public PositionType getForPositionType() {
		return forPositionType;
	}

	@Max(40)
	public int getStandardHoursePerWeek() {
		return standardHoursePerWeek;
	}

	@ManyToOne
	public PositionClassificationType getType() {
		return type;
	}

	public void setForPositionType(PositionType forPositionType) {
		this.forPositionType = forPositionType;
	}

	public void setStandardHoursePerWeek(int standardHoursePerWeek) {
		this.standardHoursePerWeek = standardHoursePerWeek;
	}

	public void setType(PositionClassificationType type) {
		this.type = type;
	}

}