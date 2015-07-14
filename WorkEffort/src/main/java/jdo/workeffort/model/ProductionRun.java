package jdo.workeffort.model;

import javax.persistence.Entity;
import javax.validation.constraints.Min;

@Entity
public class ProductionRun extends Purpose {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Min(0)
	private long quantityProduced;

	@Min(0)
	private long quantityRejected;

	@Min(1)
	private long quantityToProduce;

	public long getQuantityProduced() {
		return quantityProduced;
	}

	public long getQuantityRejected() {
		return quantityRejected;
	}

	public long getQuantityToProduce() {
		return quantityToProduce;
	}

	public void setQuantityProduced(long quantityProduced) {
		this.quantityProduced = quantityProduced;
	}

	public void setQuantityRejected(long quantityRejected) {
		this.quantityRejected = quantityRejected;
	}

	public void setQuantityToProduce(long quantityToProduce) {
		this.quantityToProduce = quantityToProduce;
	}
}
