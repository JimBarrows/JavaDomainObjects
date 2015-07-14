package jdo.product.model.feature;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;
import jdo.product.model.Product;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:36 AM
 * @see "Data Model Resource Book Volume 1 Figure 3.4, page 77"
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ProductFeatureApplicability extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private Product				availableWith;

	@ManyToOne
	private ProductFeature		usedToDefine;

	@Embedded
	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	
	public Product getAvailableWith() {
		return availableWith;
	}

	
	public ProductFeature getUsedToDefine() {
		return usedToDefine;
	}

	public void setAvailableWith(Product availableWith) {
		this.availableWith = availableWith;
	}

	public void setUsedToDefine(ProductFeature usedToDefine) {
		this.usedToDefine = usedToDefine;
	}

}