package jdo.humanresoures.model.payroll;

import jdo.fields.Money;
import jdo.model.PersistentEntity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class Deduction extends PersistentEntity {

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
