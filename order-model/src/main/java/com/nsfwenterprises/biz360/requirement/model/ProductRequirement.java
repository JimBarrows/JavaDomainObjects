package com.nsfwenterprises.biz360.requirement.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.nsfwenterprises.biz360.product.model.Product;

@Entity
public class ProductRequirement extends Requirement {

	private static final long serialVersionUID = 1L;

	private Product requesting;
	
	private List<DesiredFeature> specifying;

	@ManyToOne
	public Product getRequesting() {
		return requesting;
	}

	public ProductRequirement() {
		super();
		// TODO Auto-generated constructor stub
	}

	@OneToMany
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
