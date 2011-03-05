package com.nsfwenterprises.biz360.salestax.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.model.BaseDateRangeModel;
import com.nsfwenterprises.biz360.party.model.geographic_boundary.GeographicBoundary;
import com.nsfwenterprises.biz360.product.model.category.ProductCategory;

@Entity
public class SalesTaxLookup extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private GeographicBoundary salesTaxLookupFor;
	
	private BigDecimal salesTaxPercentage;
	
	@ManyToOne
	private ProductCategory specifiedFor;

	public GeographicBoundary getSalesTaxLookupFor() {
		return salesTaxLookupFor;
	}

	public BigDecimal getSalesTaxPercentage() {
		return salesTaxPercentage;
	}

	public ProductCategory getSpecifiedFor() {
		return specifiedFor;
	}

	public void setSalesTaxLookupFor(GeographicBoundary salesTaxLookupFor) {
		this.salesTaxLookupFor = salesTaxLookupFor;
	}

	public void setSalesTaxPercentage(BigDecimal salesTaxPercentage) {
		this.salesTaxPercentage = salesTaxPercentage;
	}

	public void setSpecifiedFor(ProductCategory specifiedFor) {
		this.specifiedFor = specifiedFor;
	}
}
