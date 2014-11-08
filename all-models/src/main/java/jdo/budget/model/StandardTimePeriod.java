package jdo.budget.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.accounting.model.asset.PeriodType;
import jdo.model.BaseDateRangeModel;

@Entity
public class StandardTimePeriod extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PeriodType type;

	@ManyToOne
	public PeriodType getType() {
		return type;
	}

	public void setType(PeriodType type) {
		this.type = type;
	}
}
