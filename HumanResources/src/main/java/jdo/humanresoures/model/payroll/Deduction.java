package jdo.humanresoures.model.payroll;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.fields.Money;
import jdo.model.BasePersistentModel;

@Entity
public class Deduction extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Embedded
	private Money amount;

	@ManyToOne
	private DeductionType type;

	/**
	 * UUID for Paycheck.
	 * 
	 */
	private UUID reductionOf;

	public UUID getReductionOf() {
		return reductionOf;
	}

	public void setReductionOf(UUID reductionOf) {
		this.reductionOf = reductionOf;
	}

	public Money getAmount() {
		return amount;
	}

	public DeductionType getType() {
		return type;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public void setType(DeductionType type) {
		this.type = type;
	}

}
