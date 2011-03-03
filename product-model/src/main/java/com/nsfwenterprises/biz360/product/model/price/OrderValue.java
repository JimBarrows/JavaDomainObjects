package com.nsfwenterprises.biz360.product.model.price;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:32 AM
 */
@Entity
public class OrderValue extends BasePersistentModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<PriceComponent> discountLevelDefinedFor = new ArrayList<PriceComponent>();
	
	private BigDecimal fromAmount;
	
	private BigDecimal thruAmount;

	@OneToMany(mappedBy="basedOnOrderValue")
	public List<PriceComponent> getDiscountLevelDefinedFor() {
		return discountLevelDefinedFor;
	}

	@Min(0)
	public BigDecimal getFromAmount() {
		return fromAmount;
	}

	public BigDecimal getThruAmount() {
		return thruAmount;
	}

	@AssertTrue
	boolean thruAmountGreaterThenEqualToFromAmount() {
		return thruAmount.compareTo(fromAmount) >= 0;
	}

	public void setDiscountLevelDefinedFor(
			List<PriceComponent> discountLevelDefinedFor) {
		this.discountLevelDefinedFor = discountLevelDefinedFor;
	}

	public void setFromAmount(BigDecimal fromAmount) {
		this.fromAmount = fromAmount;
	}

	public void setThruAmount(BigDecimal thruAmount) {
		this.thruAmount = thruAmount;
	}
}