package mbmp.product.model.category;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import mbmp.model.BaseDateRangeModel;
import mbmp.party.model.PartyClassification;

/**This maps the interest certain categories of parties have in a particular product, over time.
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:31 AM
 * @see "Data Model Resource Book Volume 1 Figure 3.2, page 73"
 */
@Entity
public class MarketInterest extends BaseDateRangeModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private PartyClassification interestFor;

	
	private ProductCategory of;

	@ManyToOne
	public PartyClassification getInterestFor() {
		return interestFor;
	}

	@ManyToOne
	@JoinColumn(name="productCategoryOf")
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