package jdo.salestax.model;

import jdo.fields.DateTimeRange;
import jdo.fields.Money;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class SalesTaxLookup extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * UUID for GeographicBoundary.
	 * 
	 */
	private UUID salesTaxLookupFor;
	@Embedded
	private Money salesTaxPercentage;
	/**
	 * UUId for ProductCategory.
	 * 
	 */
	private UUID specifiedFor;
	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public UUID getSalesTaxLookupFor() {
		return salesTaxLookupFor;
	}

	public Money getSalesTaxPercentage() {
		return salesTaxPercentage;
	}

	public UUID getSpecifiedFor() {
		return specifiedFor;
	}

	public void setSalesTaxLookupFor(UUID salesTaxLookupFor) {
		this.salesTaxLookupFor = salesTaxLookupFor;
	}

	public void setSalesTaxPercentage(Money salesTaxPercentage) {
		this.salesTaxPercentage = salesTaxPercentage;
	}

	public void setSpecifiedFor(UUID specifiedFor) {
		this.specifiedFor = specifiedFor;
	}
}
