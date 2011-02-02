package com.nsfwenterprises.biz360.humanresoures.model.skills;

import java.util.Date;

import javax.persistence.Entity;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class Resume extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Date dateReceived;
	
	private String text;

	public Date getDateReceived() {
		return dateReceived;
	}

	public String getText() {
		return text;
	}

	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}

	public void setText(String text) {
		this.text = text;
	}

}
