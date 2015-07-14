package jdo.product.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;

/**
 * Shows which products can be substituted by other products.
 * 
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:37 AM
 */
@Entity
public class ProductSubstitute extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Product aUseOf;

	@Lob
	private String comment;

	@Min(0)
	private long quantity;

	@ManyToOne
	private Product substituteFor;

	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public Product getAUseOf() {
		return aUseOf;
	}

	public String getComment() {
		return comment;
	}

	public long getQuantity() {
		return quantity;
	}

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