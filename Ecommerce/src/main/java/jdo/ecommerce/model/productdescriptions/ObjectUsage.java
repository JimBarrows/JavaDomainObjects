package jdo.ecommerce.model.productdescriptions;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;

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
