package jdo.humanresoures.model.position.salary;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.accounting.model.asset.PeriodType;
import jdo.humanresoures.model.position.type.PositionType;
import jdo.model.BaseDateRangeModel;

@Entity
public class PositionTypeRate extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SalaryStep associatedWith;
	
	private PeriodType forPeriodType;
	
	private PositionType forPositionType;
	
	private RateType forRateType;
	
	private BigDecimal rate;

	@ManyToOne
	public SalaryStep getAssociatedWith() {
		return associatedWith;
	}

	public PeriodType getForPeriodType() {
		return forPeriodType;
	}

	@ManyToOne
	public PositionType getForPositionType() {
		return forPositionType;
	}

	@ManyToOne
	public RateType getForRateType() {
		return forRateType;
	}

	public BigDecimal getRate() {
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

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

}
