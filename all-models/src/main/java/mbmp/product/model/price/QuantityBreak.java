package mbmp.product.model.price;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;

import mbmp.model.BasePersistentModel;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:37 AM
 */
@Entity
public class QuantityBreak extends BasePersistentModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<PriceComponent> discountLevelDefinedFor = new ArrayList<PriceComponent>();
		
	private int fromQuantity;	
	
	private int thruQuantity;

	@OneToMany
	public List<PriceComponent> getDiscountLevelDefinedFor() {
		return discountLevelDefinedFor;
	}

	@Min(0)
	public int getFromQuantity() {
		return fromQuantity;
	}

	@Min(1)
	public int getThruQuantity() {
		return thruQuantity;
	}

	@AssertTrue
	boolean thruQuantityGreaterOrEqualToFromQuantity() {
		return thruQuantity >= fromQuantity;
	}

	public void setDiscountLevelDefinedFor(
			List<PriceComponent> discountLevelDefinedFor) {
		this.discountLevelDefinedFor = discountLevelDefinedFor;
	}

	public void setFromQuantity(int fromQuantity) {
		this.fromQuantity = fromQuantity;
	}

	public void setThruQuantity(int thruQuantity) {
		this.thruQuantity = thruQuantity;
	}
}