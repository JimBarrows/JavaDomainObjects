package jdo.workeffort.rate;

import java.math.BigDecimal;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.humanresoures.model.position.salary.RateType;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.Party;

@Entity
public class PartyRate extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigDecimal rate;
	
	private Party rateFor;
	
	private RateType rateType;
	
	private DateTimeRange	dateTimeRange	= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public BigDecimal getRate() {
		return rate;
	}

	@ManyToOne
	public Party getRateFor() {
		return rateFor;
	}

	@ManyToOne
	public RateType getRateType() {
		return rateType;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public void setRateFor(Party rateFor) {
		this.rateFor = rateFor;
	}

	public void setRateType(RateType rateType) {
		this.rateType = rateType;
	}

}
