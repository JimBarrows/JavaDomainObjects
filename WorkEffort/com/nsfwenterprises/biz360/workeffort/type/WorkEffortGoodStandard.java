package com.nsfwenterprises.biz360.workeffort.type;

import javax.persistence.Entity;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class WorkEffortGoodStandard extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int estiamtedCost;
	
	private int estimatedQuantity;

	public int getEstiamtedCost() {
		return estiamtedCost;
	}

	public int getEstimatedQuantity() {
		return estimatedQuantity;
	}

	public void setEstiamtedCost(int estiamtedCost) {
		this.estiamtedCost = estiamtedCost;
	}

	public void setEstimatedQuantity(int estimatedQuantity) {
		this.estimatedQuantity = estimatedQuantity;
	}

}
