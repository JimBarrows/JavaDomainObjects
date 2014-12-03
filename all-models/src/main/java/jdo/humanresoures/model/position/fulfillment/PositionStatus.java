package jdo.humanresoures.model.position.fulfillment;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;

@Entity
public class PositionStatus extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private PositionStatusType	type;

	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	@ManyToOne
	public PositionStatusType getType() {
		return type;
	}

	public void setType(PositionStatusType type) {
		this.type = type;
	}

}
