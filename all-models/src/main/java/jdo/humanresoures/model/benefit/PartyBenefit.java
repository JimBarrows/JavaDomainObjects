package jdo.humanresoures.model.benefit;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.accounting.model.asset.PeriodType;
import jdo.fields.Money;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.relationship.Employment;

@Entity
public class PartyBenefit extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private int					actualEmployerPaidPercent;

	private int					availableTime;

	private Employment			benefitFor;

	private Money				cost;

	private PeriodType			period;

	private BenefitType			type;

	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

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

	@Embedded
	public Money getCost() {
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

	public void setCost(Money cost) {
		this.cost = cost;
	}

	public void setPeriod(PeriodType period) {
		this.period = period;
	}

	public void setType(BenefitType type) {
		this.type = type;
	}

}
