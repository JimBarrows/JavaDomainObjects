package jdo.product.model.cost;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import jdo.fields.Money;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.Organization;
import jdo.party.model.geographic_boundary.GeographicBoundary;
import jdo.product.model.Product;
import jdo.product.model.feature.ProductFeature;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:29 AM
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class EstimatedProductCost extends BasePersistentModel {

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

	@ManyToOne
	private GeographicBoundary	specifiedForGeographicBoundary;

	@ManyToOne
	private Organization		specifiedForOrganization;

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

	
	public GeographicBoundary getSpecifiedForGeographicBoundary() {
		return specifiedForGeographicBoundary;
	}

	
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

	public void setCost(Money cost) {
		this.cost = cost;
	}

	public void setSpecifiedForGeographicBoundary(GeographicBoundary specifiedForGeographicBoundary) {
		this.specifiedForGeographicBoundary = specifiedForGeographicBoundary;
	}

	public void setSpecifiedForOrganization(Organization specifiedForOrganization) {
		this.specifiedForOrganization = specifiedForOrganization;
	}

}