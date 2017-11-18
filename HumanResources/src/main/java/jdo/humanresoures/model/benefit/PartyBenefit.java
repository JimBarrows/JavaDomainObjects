package jdo.humanresoures.model.benefit;

import jdo.fields.DateTimeRange;
import jdo.fields.Money;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class PartyBenefit extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int actualEmployerPaidPercent;

	private int availableTime;

	/**
	 * UUID for Employment.
	 * 
	 */
	private UUID benefitFor;

	@Embedded
	private Money cost;

	/**
	 * UUID for PeriodType.
	 * 
	 */
	private UUID period;

	@ManyToOne
	private BenefitType type;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

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

	public UUID getBenefitFor() {
		return benefitFor;
	}

	public Money getCost() {
		return cost;
	}

	public UUID getPeriod() {
		return period;
	}

	public BenefitType getType() {
		return type;
	}

	public void setActualEmployerPaidPercent(int actualEmployerPaidPercent) {
		this.actualEmployerPaidPercent = actualEmployerPaidPercent;
	}

	public void setAvailableTime(int availableTime) {
		this.availableTime = availableTime;
	}

	public void setBenefitFor(UUID benefitFor) {
		this.benefitFor = benefitFor;
	}

	public void setCost(Money cost) {
		this.cost = cost;
	}

	public void setPeriod(UUID period) {
		this.period = period;
	}

	public void setType(BenefitType type) {
		this.type = type;
	}

}
