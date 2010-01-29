package com.nsfwenterprises.biz360.humanresoures.model.performance;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;
import com.nsfwenterprises.biz360.party.model.role.Employee;
import com.nsfwenterprises.biz360.party.model.role.Manager;

@Entity
public class PerformanceNote extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String comment;
	
	private Date communicationDate;
	
	private Employee forEmployee;
	
	private Manager fromManger;
	
	private PerformanceNoteType type;

	public String getComment() {
		return comment;
	}

	public Date getCommunicationDate() {
		return communicationDate;
	}

	public Employee getForEmployee() {
		return forEmployee;
	}

	public Manager getFromManger() {
		return fromManger;
	}

	@ManyToOne
	public PerformanceNoteType getType() {
		return type;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setCommunicationDate(Date communicationDate) {
		this.communicationDate = communicationDate;
	}

	public void setForEmployee(Employee forEmployee) {
		this.forEmployee = forEmployee;
	}

	public void setFromManger(Manager fromManger) {
		this.fromManger = fromManger;
	}

	public void setType(PerformanceNoteType type) {
		this.type = type;
	}

}
