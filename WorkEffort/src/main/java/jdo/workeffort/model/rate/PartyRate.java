package jdo.workeffort.model.rate;

import jdo.fields.DateTimeRange;
import jdo.fields.Money;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.util.UUID;

@Entity
public class PartyRate extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Embedded
	private Money rate;
	/**
	 * UUID of the Party.
	 * 
	 */
	private UUID rateFor;
	/**
	 * UUID of the RateType.
	 * 
	 */
	private UUID rateType;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public Money getRate() {
		return rate;
	}

	public UUID getRateFor() {
		return rateFor;
	}

	public UUID getRateType() {
		return rateType;
	}

	public void setRate(Money rate) {
		this.rate = rate;
	}

	public void setRateFor(UUID rateFor) {
		this.rateFor = rateFor;
	}

	public void setRateType(UUID rateType) {
		this.rateType = rateType;
	}

}
