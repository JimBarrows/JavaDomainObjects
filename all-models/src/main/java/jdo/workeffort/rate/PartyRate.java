package jdo.workeffort.rate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.fields.Money;
import jdo.humanresoures.model.position.salary.RateType;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Entity
public class PartyRate extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;
	@Embedded
	private Money				rate;
	@ManyToOne
	private Party				rateFor;
	@ManyToOne
	private RateType			rateType;
	@Embedded
	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	
	public Money getRate() {
		return rate;
	}

	
	public Party getRateFor() {
		return rateFor;
	}

	
	public RateType getRateType() {
		return rateType;
	}

	public void setRate(Money rate) {
		this.rate = rate;
	}

	public void setRateFor(Party rateFor) {
		this.rateFor = rateFor;
	}

	public void setRateType(RateType rateType) {
		this.rateType = rateType;
	}

}
