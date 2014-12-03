package jdo.product.model.category;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.xml.crypto.Data;

import jdo.model.BasePersistentModel;
import jdo.product.model.price.PriceComponent;

/**
 * All the different categories a product can be a part of. A Category can be a
 * sub-category.
 * 
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:35 AM
 * @see Data Model Resource Book Volume 1 Figure 3.2, page 73
 */
@Entity
public class ProductCategory extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long					serialVersionUID	= 1L;

	private String								description;

	private List<ProductCategory>				madeUpOf			= new ArrayList<ProductCategory>();

	private List<MarketInterest>				ofInterestTo		= new ArrayList<MarketInterest>();

	private ProductCategory						partOf;

	private List<ProductCategoryClassification>	usedToDefine		= new ArrayList<ProductCategoryClassification>();

	private List<PriceComponent>				usedToDefinePrice	= new ArrayList<PriceComponent>();

	@NotNull
	@Column(nullable = false, unique = true)
	public String getDescription() {
		return description;
	}

	@OneToMany(mappedBy = "partOf")
	public List<ProductCategory> getMadeUpOf() {
		return madeUpOf;
	}

	@OneToMany(mappedBy = "of")
	public List<MarketInterest> getOfInterestTo() {
		return ofInterestTo;
	}

	@ManyToOne
	public ProductCategory getPartOf() {
		return partOf;
	}

	@OneToMany(mappedBy = "definedBy")
	public List<ProductCategoryClassification> getUsedToDefine() {
		return usedToDefine;
	}

	@OneToMany(mappedBy = "basedOnProductCategory")
	public List<PriceComponent> getUsedToDefinePrice() {
		return usedToDefinePrice;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setMadeUpOf(List<ProductCategory> madeUpOf) {
		this.madeUpOf = madeUpOf;
	}

	public void setOf(List<MarketInterest> of) {
		this.ofInterestTo = of;
	}

	public void setOfInterestTo(List<MarketInterest> ofInterestTo) {
		this.ofInterestTo = ofInterestTo;
	}

	public void setPartOf(ProductCategory partOf) {
		this.partOf = partOf;
	}

	public void setUsedToDefine(List<ProductCategoryClassification> usedToDefine) {
		this.usedToDefine = usedToDefine;
	}

	public void setUsedToDefinePrice(List<PriceComponent> usedToDefinePrice) {
		this.usedToDefinePrice = usedToDefinePrice;
	}

}