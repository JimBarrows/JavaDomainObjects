package jdo.product.model.price;

import jdo.fields.Money;
import jdo.model.PersistentEntity;

import javax.persistence.*;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:32 AM
 */
@Entity
public class OrderValue extends PersistentEntity {

	/**
	 * 
	 */
	private static final long		serialVersionUID		= 1L;

	@OneToMany(mappedBy = "basedOnOrderValue")
	private List<PriceComponent>	discountLevelDefinedFor	= new ArrayList<PriceComponent>();

	@Min(0)
	@Embedded
	@AttributeOverrides(value={
			@AttributeOverride(column=@Column(name="fromAmountCurrency"), name="currency"),
			@AttributeOverride(column=@Column(name="fromAmountAmount"), name="amount")
	})
	private Money					fromAmount;

	@Embedded
	@AttributeOverrides(value={
			@AttributeOverride(column=@Column(name="thruAmountCurrency"), name="currency"),
			@AttributeOverride(column=@Column(name="thruAmountAmount"), name="amount")
	})
	private Money					thruAmount;

	
	public List<PriceComponent> getDiscountLevelDefinedFor() {
		return discountLevelDefinedFor;
	}

	
	public Money getFromAmount() {
		return fromAmount;
	}

	
	public Money getThruAmount() {
		return thruAmount;
	}

	@AssertTrue
	boolean thruAmountGreaterThenEqualToFromAmount() {
		return thruAmount.compareTo(fromAmount) >= 0;
	}

	public void setDiscountLevelDefinedFor(List<PriceComponent> discountLevelDefinedFor) {
		this.discountLevelDefinedFor = discountLevelDefinedFor;
	}

	public void setFromAmount(Money fromAmount) {
		this.fromAmount = fromAmount;
	}

	public void setThruAmount(Money thruAmount) {
		this.thruAmount = thruAmount;
	}
}