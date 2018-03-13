package jdo.product.model.category;

import jdo.model.PersistentEntity;
import jdo.product.model.price.PriceComponent;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

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
public class ProductCategory extends PersistentEntity {

	/**
	 * 
	 */
	private static final long					serialVersionUID	= 1L;

	@NotEmpty
	@Column(nullable = false, unique = true)
	private String								description;

	@OneToMany(mappedBy = "partOf")
	private List<ProductCategory>				madeUpOf			= new ArrayList<ProductCategory>();
	@OneToMany(mappedBy = "of")
	private List<MarketInterest>				ofInterestTo		= new ArrayList<MarketInterest>();

	@ManyToOne
	private ProductCategory						partOf;

	@OneToMany(mappedBy = "definedBy")
	private List<ProductCategoryClassification>	usedToDefine		= new ArrayList<ProductCategoryClassification>();

	@OneToMany(mappedBy = "basedOnProductCategory")
	private List<PriceComponent>				usedToDefinePrice	= new ArrayList<PriceComponent>();

	
	public String getDescription() {
		return description;
	}

	
	public List<ProductCategory> getMadeUpOf() {
		return madeUpOf;
	}

	
	public List<MarketInterest> getOfInterestTo() {
		return ofInterestTo;
	}

	
	public ProductCategory getPartOf() {
		return partOf;
	}

	
	public List<ProductCategoryClassification> getUsedToDefine() {
		return usedToDefine;
	}

	
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