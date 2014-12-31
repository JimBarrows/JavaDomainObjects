package jdo.invoice.model.billing;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.workeffort.WorkEffort;

import org.hibernate.validator.constraints.Range;

@Entity
public class WorkEffortBilling extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Range(min = 1, max = 100)
	private int								percentage;

	@ManyToOne
	private WorkEffort				percentageOf;

	public int getPercentage() {
		return percentage;
	}

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
