package jdo.humanresoures.model.position.fulfillment;

import jdo.fields.DateTimeRange;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class PositionStatus extends PersistentEntity {

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;

	@ManyToOne
	private PositionStatusType	type;

	@Embedded
	private DateTimeRange				dateTimeRange			= new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public PositionStatusType getType() {
		return type;
	}

	public void setType(PositionStatusType type) {
		this.type = type;
	}

}
