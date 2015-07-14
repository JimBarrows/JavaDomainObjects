package jdo.ecommerce.model.productdescriptions;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;

@Entity
public class ObjectUsage extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Embedded
	private DateTimeRange		dateTimeRange		= new DateTimeRange();
	
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

}
