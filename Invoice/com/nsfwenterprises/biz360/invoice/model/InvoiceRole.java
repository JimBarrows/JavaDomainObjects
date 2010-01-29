package com.nsfwenterprises.biz360.invoice.model;

import java.util.Date;

import javax.persistence.Entity;

import org.hibernate.validator.Range;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class InvoiceRole extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int percentage;
		
	private Date performedOn;

	@Range(min=0, max=100)
	public int getPercentage() {
		return percentage;
	}

	public Date getPerformedOn() {
		return performedOn;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public void setPerformedOn(Date performedOn) {
		this.performedOn = performedOn;
	}
}
