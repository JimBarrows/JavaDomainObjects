package jdo.requirement.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;

@Entity
public class DesiredFeature extends BasePersistentModel {

	private static final long serialVersionUID = 1L;
	/**
	 * UUID of the ProductFeature.
	 * 
	 */
	private UUID describedBy;

	@ManyToOne
	private ProductRequirement productRequirement;

	public ProductRequirement getProductRequirement() {
		return productRequirement;
	}

	public void setProductRequirement(ProductRequirement productRequirement) {
		this.productRequirement = productRequirement;
	}

	private boolean optional;

	public UUID getDescribedBy() {
		return describedBy;
	}

	public boolean isOptional() {
		return optional;
	}

	public void setDescribedBy(final UUID describedBy) {
		this.describedBy = describedBy;
	}

	public void setOptional(final boolean optional) {
		this.optional = optional;
	}
}
