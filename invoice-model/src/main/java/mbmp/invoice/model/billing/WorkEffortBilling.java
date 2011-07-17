package mbmp.invoice.model.billing;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import mbmp.model.BasePersistentModel;
import mbmp.workeffort.WorkEffort;

import org.hibernate.validator.constraints.Range;

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
