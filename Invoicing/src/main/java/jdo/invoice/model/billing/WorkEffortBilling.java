package jdo.invoice.model.billing;

import jdo.model.PersistentEntity;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class WorkEffortBilling extends PersistentEntity {

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
