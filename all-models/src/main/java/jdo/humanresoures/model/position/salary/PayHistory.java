package jdo.humanresoures.model.position.salary;

import java.math.BigDecimal;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.accounting.model.asset.PeriodType;
import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.party.model.relationship.Employment;

@Entity
public class PayHistory extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private BigDecimal			amount;

	private String				comment;

	private PeriodType			forPeriodType;

	private Employment			recordFor;

	private SalaryStep			step;

	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public String getComment() {
		return comment;
	}

	public PeriodType getForPeriodType() {
		return forPeriodType;
	}

	@ManyToOne
	public Employment getRecordFor() {
		return recordFor;
	}

	@ManyToOne
	public SalaryStep getStep() {
		return step;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setForPeriodType(PeriodType forPeriodType) {
		this.forPeriodType = forPeriodType;
	}

	public void setRecordFor(Employment recordFor) {
		this.recordFor = recordFor;
	}

	public void setStep(SalaryStep step) {
		this.step = step;
	}

}
