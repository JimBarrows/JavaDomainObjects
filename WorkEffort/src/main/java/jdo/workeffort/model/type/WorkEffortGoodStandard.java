package jdo.workeffort.model.type;

import jdo.fields.Money;
import jdo.model.PersistentEntity;

import javax.persistence.Entity;

@Entity
public class WorkEffortGoodStandard extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Money estimatedCost;

	private int estimatedQuantity;

	public Money getEstimatedCost() {
		return estimatedCost;
	}

	public int getEstimatedQuantity() {
		return estimatedQuantity;
	}

	public void setEstimatedCost(Money estimatedCost) {
		this.estimatedCost = estimatedCost;
	}

	public void setEstimatedQuantity(int estimatedQuantity) {
		this.estimatedQuantity = estimatedQuantity;
	}

}
