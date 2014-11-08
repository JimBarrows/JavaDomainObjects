package jdo.product.model;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import jdo.model.BaseDateRangeModel;

/**Shows which products can be substituted by other products.
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:37 AM
 */
@Entity
public class ProductSubstitute extends BaseDateRangeModel{

	/**
	 * 
	 */	
	private static final long serialVersionUID = 1L;
	
	
	private Product aUseOf;
	
	
	private String comment;
	
	
	private long quantity;
	
	
	private Product substituteFor;

	@ManyToOne
	public Product getAUseOf() {
		return aUseOf;
	}

	@Lob
	public String getComment() {
		return comment;
	}

	@Min(0)
	public long getQuantity() {
		return quantity;
	}

	@ManyToOne
	public Product getSubstituteFor() {
		return substituteFor;
	}

	public void setAUseOf(Product useOf) {
		aUseOf = useOf;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public void setSubstituteFor(Product substituteFor) {
		this.substituteFor = substituteFor;
	}

}