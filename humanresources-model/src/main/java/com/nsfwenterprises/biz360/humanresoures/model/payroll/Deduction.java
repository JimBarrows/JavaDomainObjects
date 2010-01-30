package com.nsfwenterprises.biz360.humanresoures.model.payroll;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.nsfwenterprises.biz360.invoice.model.payment.Paycheck;
import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class Deduction extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigDecimal amount;
	
	private Paycheck reductionOf;
	
	private DeductionType type;

	public BigDecimal getAmount() {
		return amount;
	}

	@ManyToOne
	public Paycheck getReductionOf() {
		return reductionOf;
	}

	@ManyToOne
	public DeductionType getType() {
		return type;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setReductionOf(Paycheck reductionOf) {
		this.reductionOf = reductionOf;
	}

	public void setType(DeductionType type) {
		this.type = type;
	}

}
