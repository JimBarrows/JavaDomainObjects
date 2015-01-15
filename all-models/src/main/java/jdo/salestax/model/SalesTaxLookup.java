package jdo.salestax.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.fields.Money;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import jdo.product.model.category.ProductCategory;

@Entity
public class SalesTaxLookup extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	@ManyToOne
	private GeographicBoundary	salesTaxLookupFor;
	@Embedded
	private Money				salesTaxPercentage;
	@ManyToOne
	private ProductCategory		specifiedFor;
	@Embedded
	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	
	public GeographicBoundary getSalesTaxLookupFor() {
		return salesTaxLookupFor;
	}

	
	public Money getSalesTaxPercentage() {
		return salesTaxPercentage;
	}

	
	public ProductCategory getSpecifiedFor() {
		return specifiedFor;
	}

	public void setSalesTaxLookupFor(GeographicBoundary salesTaxLookupFor) {
		this.salesTaxLookupFor = salesTaxLookupFor;
	}

	public void setSalesTaxPercentage(Money salesTaxPercentage) {
		this.salesTaxPercentage = salesTaxPercentage;
	}

	public void setSpecifiedFor(ProductCategory specifiedFor) {
		this.specifiedFor = specifiedFor;
	}
}
