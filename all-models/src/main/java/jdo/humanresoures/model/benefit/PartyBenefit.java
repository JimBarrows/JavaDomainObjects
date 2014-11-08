package jdo.humanresoures.model.benefit;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.accounting.model.asset.PeriodType;
import jdo.model.BaseDateRangeModel;
import jdo.party.model.relationship.Employment;

@Entity
public class PartyBenefit extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int actualEmployerPaidPercent;
	
	private int availableTime;
	
	private Employment benefitFor;
	
	private BigDecimal cost;
	
	private PeriodType period;
	
	private BenefitType type;

	public int getActualEmployerPaidPercent() {
		return actualEmployerPaidPercent;
	}

	public int getAvailableTime() {
		return availableTime;
	}

	@ManyToOne
	public Employment getBenefitFor() {
		return benefitFor;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public PeriodType getPeriod() {
		return period;
	}

	@ManyToOne
	public BenefitType getType() {
		return type;
	}

	public void setActualEmployerPaidPercent(int actualEmployerPaidPercent) {
		this.actualEmployerPaidPercent = actualEmployerPaidPercent;
	}

	public void setAvailableTime(int availableTime) {
		this.availableTime = availableTime;
	}

	public void setBenefitFor(Employment benefitFor) {
		this.benefitFor = benefitFor;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public void setPeriod(PeriodType period) {
		this.period = period;
	}

	public void setType(BenefitType type) {
		this.type = type;
	}

}
