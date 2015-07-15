package jdo.product.model.price;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;

import jdo.model.BasePersistentModel;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:37 AM
 */
@Entity
public class QuantityBreak extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long		serialVersionUID		= 1L;

	@OneToMany
	private List<PriceComponent>	discountLevelDefinedFor	= new ArrayList<PriceComponent>();

	@Min(0)
	private int						fromQuantity;

	@Min(1)
	private int						thruQuantity;

	
	public List<PriceComponent> getDiscountLevelDefinedFor() {
		return discountLevelDefinedFor;
	}

	
	public int getFromQuantity() {
		return fromQuantity;
	}

	
	public int getThruQuantity() {
		return thruQuantity;
	}

	@AssertTrue
	boolean thruQuantityGreaterOrEqualToFromQuantity() {
		return thruQuantity >= fromQuantity;
	}

	public void setDiscountLevelDefinedFor(List<PriceComponent> discountLevelDefinedFor) {
		this.discountLevelDefinedFor = discountLevelDefinedFor;
	}

	public void setFromQuantity(int fromQuantity) {
		this.fromQuantity = fromQuantity;
	}

	public void setThruQuantity(int thruQuantity) {
		this.thruQuantity = thruQuantity;
	}
}