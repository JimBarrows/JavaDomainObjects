package jdo.budget.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.accounting.model.asset.PeriodType;
import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;

@Entity
public class StandardTimePeriod extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private PeriodType				type;

	@Embedded
	private DateTimeRange			dateTimeRange			= new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public PeriodType getType() {
		return type;
	}

	public void setType(PeriodType type) {
		this.type = type;
	}
}
