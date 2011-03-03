package com.nsfwenterprises.biz360.product.model.feature;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.nsfwenterprises.biz360.model.BasePersistentModel;
import com.nsfwenterprises.biz360.product.model.cost.EstimatedProductCost;
import com.nsfwenterprises.biz360.product.model.feature.interaction.ProductFeatureInteraction;
import com.nsfwenterprises.biz360.product.model.price.PriceComponent;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:36 AM
 * @see "Data Model Resource Book Volume 1 Figure 3.4, page 77"
 */
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
public class ProductFeature extends BasePersistentModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ProductFeatureCategory categorizedBy;
	
	private List<EstimatedProductCost> costedBy = new ArrayList<EstimatedProductCost>();
	
	private List<ProductFeatureInteraction> dependentOnSelectionOf;	
	
	private String description;
	
	private List<PriceComponent> pricedBy = new ArrayList<PriceComponent>();
	
	private List<ProductFeatureInteraction> selectedIn = new ArrayList<ProductFeatureInteraction>();
	
	private List<ProductFeatureApplicability> usedToDefine = new ArrayList<ProductFeatureApplicability>();

	@ManyToOne
	@NotNull
	public ProductFeatureCategory getCategorizedBy() {
		return categorizedBy;
	}

	@OneToMany(mappedBy="calculatedForFeature")
	public List<EstimatedProductCost> getCostedBy() {
		return costedBy;
	}

	@OneToMany
	public List<ProductFeatureInteraction> getDependentOnSelectionOf() {
		return dependentOnSelectionOf;
	}

	@NotEmpty
	@Column(unique=true, nullable=false)
	public String getDescription() {
		return description;
	}
	
	@OneToMany(mappedBy="priceDefinedForProductFeature")
	public List<PriceComponent> getPricedBy() {
		return pricedBy;
	}
	
	@OneToMany(mappedBy="of")
	public List<ProductFeatureInteraction> getSelectedIn() {
		return selectedIn;
	}

	@OneToMany
	public List<ProductFeatureApplicability> getUsedToDefine() {
		return usedToDefine;
	}

	public void setCategorizedBy(ProductFeatureCategory categorizedBy) {
		this.categorizedBy = categorizedBy;
	}

	public void setCostedBy(List<EstimatedProductCost> costedBy) {
		this.costedBy = costedBy;
	}
	
	public void setDependentOnSelectionOf(
			List<ProductFeatureInteraction> dependentOnSelectionOf) {
		this.dependentOnSelectionOf = dependentOnSelectionOf;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPricedBy(List<PriceComponent> pricedBy) {
		this.pricedBy = pricedBy;
	}

	public void setSelectedIn(List<ProductFeatureInteraction> selectedIn) {
		this.selectedIn = selectedIn;
	}

	public void setUsedToDefine(List<ProductFeatureApplicability> usedToDefine) {
		this.usedToDefine = usedToDefine;
	}

}