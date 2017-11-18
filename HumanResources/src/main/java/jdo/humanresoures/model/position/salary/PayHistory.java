package jdo.humanresoures.model.position.salary;

import jdo.fields.DateTimeRange;
import jdo.fields.Money;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class PayHistory extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Embedded
	private Money amount;

	private String comment;

	/**
	 * UUID for PeriodType.
	 * 
	 */
	private UUID forPeriodType;

	/**
	 * UUID for Employment.
	 * 
	 */
	private UUID recordFor;

	@ManyToOne
	private SalaryStep step;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public Money getAmount() {
		return amount;
	}

	public String getComment() {
		return comment;
	}

	public UUID getForPeriodType() {
		return forPeriodType;
	}

	public UUID getRecordFor() {
		return recordFor;
	}

	public SalaryStep getStep() {
		return step;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setForPeriodType(UUID forPeriodType) {
		this.forPeriodType = forPeriodType;
	}

	public void setRecordFor(UUID recordFor) {
		this.recordFor = recordFor;
	}

	public void setStep(SalaryStep step) {
		this.step = step;
	}

}
