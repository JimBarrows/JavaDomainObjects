package jdo.requirement.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.product.model.Product;

@Entity
public class ProductRequirement extends Requirement {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Product requesting;
	
	@OneToMany(mappedBy="productRequirement")
	private List<DesiredFeature> specifying;

	public Product getRequesting() {
		return requesting;
	}

	public ProductRequirement() {
		super();
	}

	public List<DesiredFeature> getSpecifying() {
		return specifying;
	}

	public void setRequesting(final Product requesting) {
		this.requesting = requesting;
	}

	public void setSpecifying(final List<DesiredFeature> specifying) {
		this.specifying = specifying;
	}
}
