package jdo.product.model.feature;

import jdo.model.PersistentEntity;
import jdo.product.model.cost.EstimatedProductCost;
import jdo.product.model.feature.interaction.ProductFeatureInteraction;
import jdo.product.model.price.PriceComponent;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:36 AM
 * @see "Data Model Resource Book Volume 1 Figure 3.4, page 77"
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ProductFeature extends PersistentEntity {

	/**
	 * 
	 */
	private static final long					serialVersionUID	= 1L;

	@ManyToOne
	@NotNull
	private ProductFeatureCategory				categorizedBy;

	@OneToMany(mappedBy = "calculatedForFeature")
	private List<EstimatedProductCost>			costedBy			= new ArrayList<EstimatedProductCost>();

	@OneToMany
	private List<ProductFeatureInteraction>		dependentOnSelectionOf;

	@NotEmpty
	@Column(unique = true, nullable = false)
	private String								description;

	@OneToMany(mappedBy = "priceDefinedForProductFeature")
	private List<PriceComponent>				pricedBy			= new ArrayList<PriceComponent>();

	@OneToMany(mappedBy = "of")
	private List<ProductFeatureInteraction>		selectedIn			= new ArrayList<ProductFeatureInteraction>();

	@OneToMany
	private List<ProductFeatureApplicability>	usedToDefine		= new ArrayList<ProductFeatureApplicability>();

	
	public ProductFeatureCategory getCategorizedBy() {
		return categorizedBy;
	}

	
	public List<EstimatedProductCost> getCostedBy() {
		return costedBy;
	}

	
	public List<ProductFeatureInteraction> getDependentOnSelectionOf() {
		return dependentOnSelectionOf;
	}

	
	public String getDescription() {
		return description;
	}

	
	public List<PriceComponent> getPricedBy() {
		return pricedBy;
	}

	
	public List<ProductFeatureInteraction> getSelectedIn() {
		return selectedIn;
	}

	
	public List<ProductFeatureApplicability> getUsedToDefine() {
		return usedToDefine;
	}

	public void setCategorizedBy(ProductFeatureCategory categorizedBy) {
		this.categorizedBy = categorizedBy;
	}

	public void setCostedBy(List<EstimatedProductCost> costedBy) {
		this.costedBy = costedBy;
	}

	public void setDependentOnSelectionOf(List<ProductFeatureInteraction> dependentOnSelectionOf) {
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