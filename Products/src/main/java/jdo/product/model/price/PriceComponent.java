package jdo.product.model.price;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import jdo.fields.DateTimeRange;
import jdo.fields.Money;
import jdo.model.BasePersistentModel;
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
public class PriceComponent extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	/** UUID to the GeographicBoundary.
	 * 
	 */
	private UUID	basedOnGeographicBoundary;

	@ManyToOne
	private OrderValue			basedOnOrderValue;

	/** UUID to the PartyClassification
	 * 
	 */
	private UUID	basedOnPartyType;

	@ManyToOne
	private ProductCategory		basedOnProductCategory;

	@ManyToOne
	private QuantityBreak		basedOnQuantityBreak;

	@ManyToOne
	private SaleType			basedOnSaleType;
	
	/** UUID to the AgreementPricingProgram.
	 * 
	 */
	private UUID basedOnAgreementPricingProgram;

	

	@Lob
	private String				comment;

	private int					percent;

	@Embedded
	private Money				price;

	@ManyToOne
	private Product				priceDefinedForProduct;

	@ManyToOne
	private ProductFeature		priceDefinedForProductFeature;

	/**UUID for the Organization.
	 * 
	 */
	@ManyToOne
	private UUID		specifiedFor;

	@Embedded
	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	
	public UUID getBasedOnGeographicBoundary() {
		return basedOnGeographicBoundary;
	}

	
	public OrderValue getBasedOnOrderValue() {
		return basedOnOrderValue;
	}

	
	public UUID getBasedOnPartyType() {
		return basedOnPartyType;
	}

	
	public ProductCategory getBasedOnProductCategory() {
		return basedOnProductCategory;
	}

	
	public QuantityBreak getBasedOnQuantityBreak() {
		return basedOnQuantityBreak;
	}

	
	public SaleType getBasedOnSaleType() {
		return basedOnSaleType;
	}

	
	public String getComment() {
		return comment;
	}

	
	public int getPercent() {
		return percent;
	}

	
	public Money getPrice() {
		return price;
	}

	
	public Product getPriceDefinedForProduct() {
		return priceDefinedForProduct;
	}

	
	public ProductFeature getPriceDefinedForProductFeature() {
		return priceDefinedForProductFeature;
	}

	
	public UUID getSpecifiedFor() {
		return specifiedFor;
	}

	public void setBasedOnGeographicBoundary(UUID basedOnGeographicBoundary) {
		this.basedOnGeographicBoundary = basedOnGeographicBoundary;
	}

	public void setBasedOnOrderValue(OrderValue basedOnOrderValue) {
		this.basedOnOrderValue = basedOnOrderValue;
	}

	public void setBasedOnPartyType(UUID basedOnPartyType) {
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

	public void setPrice(Money price) {
		this.price = price;
	}

	public void setPriceDefinedForProduct(Product priceDefinedForProduct) {
		this.priceDefinedForProduct = priceDefinedForProduct;
	}

	public void setPriceDefinedForProductFeature(ProductFeature priceDefinedForProductFeature) {
		this.priceDefinedForProductFeature = priceDefinedForProductFeature;
	}

	public void setSpecifiedFor(UUID specifiedFor) {
		this.specifiedFor = specifiedFor;
	}
	public UUID getBasedOnAgreementPricingProgram() {
		return basedOnAgreementPricingProgram;
	}

	public void setBasedOnAgreementPricingProgram(
			UUID basedOnAgreementPricingProgram) {
		this.basedOnAgreementPricingProgram = basedOnAgreementPricingProgram;
	}
}