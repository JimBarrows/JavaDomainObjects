package com.nsfwenterprises.biz360.product.model.cost;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;
import com.nsfwenterprises.biz360.party.model.Organization;
import com.nsfwenterprises.biz360.party.model.geographicBoundary.GeographicBoundary;
import com.nsfwenterprises.biz360.product.model.Product;
import com.nsfwenterprises.biz360.product.model.feature.ProductFeature;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:29 AM
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class EstimatedProductCost extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ProductFeature calculatedForFeature;

	private Product calculatedForProduct;

	
	private CostComponentType categorizedBy;

	
	private BigDecimal cost;

	
	private GeographicBoundary specifiedForGeographicBoundary;

	
	private Organization specifiedForOrganization;

	@ManyToOne
	public ProductFeature getCalculatedForFeature() {
		return calculatedForFeature;
	}

	@ManyToOne
	public Product getCalculatedForProduct() {
		return calculatedForProduct;
	}

	@ManyToOne
	public CostComponentType getCategorizedBy() {
		return categorizedBy;
	}

	@NotNull
	@Min(0)
	public BigDecimal getCost() {
		return cost;
	}
	@ManyToOne
	public GeographicBoundary getSpecifiedForGeographicBoundary() {
		return specifiedForGeographicBoundary;
	}

	@ManyToOne
	public Organization getSpecifiedForOrganization() {
		return specifiedForOrganization;
	}
	public void setCalculatedForFeature(ProductFeature calculatedForFeature) {
		this.calculatedForFeature = calculatedForFeature;
	}

	public void setCalculatedForProduct(Product calculatedForProduct) {
		this.calculatedForProduct = calculatedForProduct;
	}
	public void setCategorizedBy(CostComponentType categorizedBy) {
		this.categorizedBy = categorizedBy;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public void setSpecifiedForGeographicBoundary(
			GeographicBoundary specifiedForGeographicBoundary) {
		this.specifiedForGeographicBoundary = specifiedForGeographicBoundary;
	}

	public void setSpecifiedForOrganization(
			Organization specifiedForOrganization) {
		this.specifiedForOrganization = specifiedForOrganization;
	}

}