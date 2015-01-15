package jdo.requirement.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.product.model.feature.ProductFeature;

@Entity
public class DesiredFeature extends BasePersistentModel {

	private static final long	serialVersionUID	= 1L;
	@ManyToOne
	private ProductFeature		describedBy;
	
	@ManyToOne
	private ProductRequirement productRequirement;

	public ProductRequirement getProductRequirement() {
		return productRequirement;
	}

	public void setProductRequirement(ProductRequirement productRequirement) {
		this.productRequirement = productRequirement;
	}

	private boolean				optional;

	
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
