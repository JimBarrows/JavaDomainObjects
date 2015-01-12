package jdo.workeffort.requirement;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.product.model.Product;
import jdo.requirement.model.Requirement;

@Entity
public class WorkRequirement extends Requirement {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	// private FixedAsset workedOn;

	@ManyToOne
	private Product				producedBy;

	@ManyToOne
	private Deliverable			toProduce;

	
	public Product getProducedBy() {
		return producedBy;
	}

	
	public Deliverable getToProduce() {
		return toProduce;
	}

	public void setProducedBy(Product producedBy) {
		this.producedBy = producedBy;
	}

	public void setToProduce(Deliverable toProduce) {
		this.toProduce = toProduce;
	}

}
