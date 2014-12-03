package jdo.ecommerce.model.product;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;

@Entity
public class ObjectUsage extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private DateTimeRange	dateTimeRange	= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

}
