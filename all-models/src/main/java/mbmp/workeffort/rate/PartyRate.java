package mbmp.workeffort.rate;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import mbmp.humanresoures.model.position.salary.RateType;
import mbmp.model.BaseDateRangeModel;
import mbmp.party.model.Party;

@Entity
public class PartyRate extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigDecimal rate;
	
	private Party rateFor;
	
	private RateType rateType;

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
