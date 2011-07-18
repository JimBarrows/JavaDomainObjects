package mbmp.humanresoures.model.position.salary;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import mbmp.accounting.model.asset.PeriodType;
import mbmp.model.BaseDateRangeModel;
import mbmp.party.model.relationship.Employment;

@Entity
public class PayHistory extends BaseDateRangeModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigDecimal amount;
	
	private String comment;
	
	private PeriodType forPeriodType;
	 
	private Employment recordFor;
	
	private SalaryStep step;

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