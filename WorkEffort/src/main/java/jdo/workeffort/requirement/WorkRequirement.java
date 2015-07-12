package jdo.workeffort.requirement;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jdo.model.BasePersistentModel;

@Entity
public class WorkRequirement extends BasePersistentModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * UUID of the Requirement that this "inherits" from.
	 * 
	 */
	@NotNull
	private UUID requirement;

	/**
	 * UUID of the FixedAsset.
	 * 
	 */
	private UUID workedOn;

	/**
	 * UUID of the Product.
	 * 
	 */
	private UUID producedBy;

	@ManyToOne
	private Deliverable toProduce;

	public UUID getProducedBy() {
		return producedBy;
	}

	public Deliverable getToProduce() {
		return toProduce;
	}

	public UUID getRequirement() {
		return requirement;
	}

	public void setRequirement(UUID requirement) {
		this.requirement = requirement;
	}

	public UUID getWorkedOn() {
		return workedOn;
	}

	public void setWorkedOn(UUID workedOn) {
		this.workedOn = workedOn;
	}

	public void setProducedBy(UUID producedBy) {
		this.producedBy = producedBy;
	}

	public void setToProduce(Deliverable toProduce) {
		this.toProduce = toProduce;
	}

}
