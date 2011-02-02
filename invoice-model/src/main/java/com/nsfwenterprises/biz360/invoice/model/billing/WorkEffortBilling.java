package com.nsfwenterprises.biz360.invoice.model.billing;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.validator.Range;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.workeffort.WorkEffort;

@Entity
public class WorkEffortBilling extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int percentage;
	
	private WorkEffort percentageOf;

	@Range(min=1, max=100)
	public int getPercentage() {
		return percentage;
	}

	@ManyToOne
	public WorkEffort getPercentageOf() {
		return percentageOf;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public void setPercentageOf(WorkEffort percentageOf) {
		this.percentageOf = percentageOf;
	}

}
