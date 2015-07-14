package jdo.invoice.model.billing;

import java.util.UUID;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.Range;

import jdo.model.BasePersistentModel;

@Entity
public class WorkEffortBilling extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Range(min = 1, max = 100)
	private int percentage;

	/**
	 * UUID of WorkEffort.
	 * 
	 */
	private UUID percentageOf;

	public int getPercentage() {
		return percentage;
	}

	public UUID getPercentageOf() {
		return percentageOf;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public void setPercentageOf(UUID percentageOf) {
		this.percentageOf = percentageOf;
	}

}
