package com.nsfwenterprises.biz360.accounting.model.asset;

import javax.persistence.Entity;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class DepreciationMethod extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String description;
	
	private String formula;

	public String getDescription() {
		return description;
	}

	public String getFormula() {
		return formula;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

}
