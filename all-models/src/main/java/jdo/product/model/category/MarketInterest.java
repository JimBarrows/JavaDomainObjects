package jdo.product.model.category;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.PartyClassification;

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
	private static final long	serialVersionUID	= 1L;

	private PartyClassification	interestFor;

	private ProductCategory		of;

	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	@ManyToOne
	public PartyClassification getInterestFor() {
		return interestFor;
	}

	@ManyToOne
	@JoinColumn(name = "productCategoryOf")
	public ProductCategory getOf() {
		return of;
	}

	public void setInterestFor(PartyClassification interestFor) {
		this.interestFor = interestFor;
	}

	public void setOf(ProductCategory of) {
		this.of = of;
	}

}