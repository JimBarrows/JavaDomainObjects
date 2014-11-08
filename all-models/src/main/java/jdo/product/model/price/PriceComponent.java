package jdo.product.model.price;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import jdo.model.BaseDateRangeModel;
import jdo.party.model.Organization;
import jdo.party.model.PartyClassification;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import jdo.product.model.Product;
import jdo.product.model.category.ProductCategory;
import jdo.product.model.feature.ProductFeature;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:34 AM
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class PriceComponent extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private GeographicBoundary basedOnGeographicBoundary;	
	
	private OrderValue basedOnOrderValue;
	
	private PartyClassification basedOnPartyType;
	
	private ProductCategory basedOnProductCategory;
	
	private QuantityBreak basedOnQuantityBreak;
	
	private SaleType basedOnSaleType;
	
	private String comment;
	
	private int percent;
	
	private BigDecimal price;
	
	private Product priceDefinedForProduct;
	
	private ProductFeature priceDefinedForProductFeature;
	
	private Organization specifiedFor;

	@ManyToOne
	public GeographicBoundary getBasedOnGeographicBoundary() {
		return basedOnGeographicBoundary;
	}

	@ManyToOne
	public OrderValue getBasedOnOrderValue() {
		return basedOnOrderValue;
	}

	@ManyToOne
	public PartyClassification getBasedOnPartyType() {
		return basedOnPartyType;
	}

	@ManyToOne
	public ProductCategory getBasedOnProductCategory() {
		return basedOnProductCategory;
	}

	@ManyToOne
	public QuantityBreak getBasedOnQuantityBreak() {
		return basedOnQuantityBreak;
	}

	@ManyToOne
	public SaleType getBasedOnSaleType() {
		return basedOnSaleType;
	}

	@NotNull
	public String getComment() {
		return comment;
	}

	@Min(0)
	public int getPercent() {
		return percent;
	}

	public BigDecimal getPrice() {
		return price;
	}

	@ManyToOne
	public Product getPriceDefinedForProduct() {
		return priceDefinedForProduct;
	}

	@ManyToOne
	public ProductFeature getPriceDefinedForProductFeature() {
		return priceDefinedForProductFeature;
	}

	@ManyToOne
	public Organization getSpecifiedFor() {
		return specifiedFor;
	}

	public void setBasedOnGeographicBoundary(
			GeographicBoundary basedOnGeographicBoundary) {
		this.basedOnGeographicBoundary = basedOnGeographicBoundary;
	}

	public void setBasedOnOrderValue(OrderValue basedOnOrderValue) {
		this.basedOnOrderValue = basedOnOrderValue;
	}

	public void setBasedOnPartyType(PartyClassification basedOnPartyType) {
		this.basedOnPartyType = basedOnPartyType;
	}

	public void setBasedOnProductCategory(ProductCategory basedOnProductCategory) {
		this.basedOnProductCategory = basedOnProductCategory;
	}

	public void setBasedOnQuantityBreak(QuantityBreak basedOnQuantityBreak) {
		this.basedOnQuantityBreak = basedOnQuantityBreak;
	}

	public void setBasedOnSaleType(SaleType basedOnSaleType) {
		this.basedOnSaleType = basedOnSaleType;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public void setPriceDefinedForProduct(Product priceDefinedForProduct) {
		this.priceDefinedForProduct = priceDefinedForProduct;
	}

	public void setPriceDefinedForProductFeature(
			ProductFeature priceDefinedForProductFeature) {
		this.priceDefinedForProductFeature = priceDefinedForProductFeature;
	}

	public void setSpecifiedFor(Organization specifiedFor) {
		this.specifiedFor = specifiedFor;
	}
}