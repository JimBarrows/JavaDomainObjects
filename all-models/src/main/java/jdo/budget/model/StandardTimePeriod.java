package jdo.budget.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.accounting.model.asset.PeriodType;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;

@Entity
public class StandardTimePeriod extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private PeriodType			type;

	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	@ManyToOne
	public PeriodType getType() {
		return type;
	}

	public void setType(PeriodType type) {
		this.type = type;
	}
}
