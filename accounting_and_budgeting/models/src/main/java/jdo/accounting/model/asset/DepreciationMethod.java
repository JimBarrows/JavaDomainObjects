package jdo.accounting.model.asset;

import jdo.model.BasePersistentModel;

import javax.persistence.Entity;

@Entity
public class DepreciationMethod extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private String				description;

	private String				formula;

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
