package jdo.product.model.cost;

import jdo.fields.DateTimeRange;
import jdo.fields.Money;
import jdo.model.PersistentEntity;
import jdo.product.model.Product;
import jdo.product.model.feature.ProductFeature;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.UUID;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:29 AM
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class EstimatedProductCost extends PersistentEntity {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private ProductFeature		calculatedForFeature;

	@ManyToOne
	private Product				calculatedForProduct;

	@ManyToOne
	private CostComponentType	categorizedBy;

	@NotNull
	@Min(0)
	@Embedded
	private Money				cost;

	/**UUID for a GeographicBoundary this is for.
	 * 
	 */
	private UUID	specifiedForGeographicBoundary;

	/** UUID for the Organization this is for.
	 * 
	 */
	private UUID		specifiedForOrganization;

	@Embedded
	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	
	public ProductFeature getCalculatedForFeature() {
		return calculatedForFeature;
	}

	
	public Product getCalculatedForProduct() {
		return calculatedForProduct;
	}

	
	public CostComponentType getCategorizedBy() {
		return categorizedBy;
	}

	
	public Money getCost() {
		return cost;
	}

	
	public UUID getSpecifiedForGeographicBoundary() {
		return specifiedForGeographicBoundary;
	}

	
	public UUID getSpecifiedForOrganization() {
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

	public void setCost(Money cost) {
		this.cost = cost;
	}

	public void setSpecifiedForGeographicBoundary(UUID specifiedForGeographicBoundary) {
		this.specifiedForGeographicBoundary = specifiedForGeographicBoundary;
	}

	public void setSpecifiedForOrganization(UUID specifiedForOrganization) {
		this.specifiedForOrganization = specifiedForOrganization;
	}

}