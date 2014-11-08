package jdo.workeffort;

import javax.persistence.Entity;

@Entity
public class ProductionRun extends Purpose {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long quantityProduced;
	
	private long quantityRejected;
	
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
