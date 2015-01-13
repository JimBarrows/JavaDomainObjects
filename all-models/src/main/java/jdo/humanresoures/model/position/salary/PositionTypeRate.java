package jdo.humanresoures.model.position.salary;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.accounting.model.asset.PeriodType;
import jdo.fields.Money;
import jdo.humanresoures.model.position.type.PositionType;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;

@Entity
public class PositionTypeRate extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private SalaryStep				associatedWith;

	@ManyToOne
	private PeriodType				forPeriodType;

	@ManyToOne
	private PositionType			forPositionType;

	@ManyToOne
	private RateType					forRateType;

	@Embedded
	private Money							rate;

	@Embedded
	private DateTimeRange			dateTimeRange			= new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public SalaryStep getAssociatedWith() {
		return associatedWith;
	}

	public PeriodType getForPeriodType() {
		return forPeriodType;
	}

	public PositionType getForPositionType() {
		return forPositionType;
	}

	public RateType getForRateType() {
		return forRateType;
	}

	public Money getRate() {
		return rate;
	}

	public void setAssociatedWith(SalaryStep associatedWith) {
		this.associatedWith = associatedWith;
	}

	public void setForPeriodType(PeriodType forPeriodType) {
		this.forPeriodType = forPeriodType;
	}

	public void setForPositionType(PositionType forPositionType) {
		this.forPositionType = forPositionType;
	}

	public void setForRateType(RateType forRateType) {
		this.forRateType = forRateType;
	}

	public void setRate(Money rate) {
		this.rate = rate;
	}

}
