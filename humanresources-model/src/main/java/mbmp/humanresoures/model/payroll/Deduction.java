package mbmp.humanresoures.model.payroll;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import mbmp.model.BasePersistentModel;

@Entity
public class Deduction extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private BigDecimal amount;
	
	
	
	private DeductionType type;

	public BigDecimal getAmount() {
		return amount;
	}


	@ManyToOne
	public DeductionType getType() {
		return type;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public void setType(DeductionType type) {
		this.type = type;
	}

}
