package jdo.product.model.category;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;

/**
 * This maps the interest certain categories of parties have in a particular
 * product, over time.
 * 
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:31 AM
 * @see "Data Model Resource Book Volume 1 Figure 3.2, page 73"
 */
@Entity
public class MarketInterest extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**UUID for the party classification that this an interest for.
	 * 
	 */
	private UUID interestFor;

	@ManyToOne
	@JoinColumn(name = "productCategoryOf")
	private ProductCategory of;
	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public UUID getInterestFor() {
		return interestFor;
	}

	public ProductCategory getOf() {
		return of;
	}

	public void setInterestFor(UUID interestFor) {
		this.interestFor = interestFor;
	}

	public void setOf(ProductCategory of) {
		this.of = of;
	}

}