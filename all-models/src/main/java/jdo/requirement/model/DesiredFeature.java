package jdo.requirement.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.product.model.feature.ProductFeature;

@Entity
public class DesiredFeature extends BasePersistentModel {
	
	private static final long serialVersionUID = 1L;

	private ProductFeature describedBy;
	
	private boolean optional;

	@ManyToOne
	public ProductFeature getDescribedBy() {
		return describedBy;
	}

	public boolean isOptional() {
		return optional;
	}

	public void setDescribedBy(final ProductFeature describedBy) {
		this.describedBy = describedBy;
	}

	public void setOptional(final boolean optional) {
		this.optional = optional;
	}
}
