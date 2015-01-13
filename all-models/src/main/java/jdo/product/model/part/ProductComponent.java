package jdo.product.model.part;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import jdo.model.BasePersistentModel;
import jdo.model.DateTimeRange;
import jdo.product.model.Product;

/**
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:36 AM
 */
@Entity
public class ProductComponent extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Lob
	private String comment;

	@ManyToOne
	private Product in;

	@Lob
	private String instruction;

	@ManyToOne
	private Product productFor;

	@Min(1)
	private long quantityUsed;
	@Embedded
	private DateTimeRange dateTimeRange = new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public String getComment() {
		return comment;
	}

	public Product getIn() {
		return in;
	}

	public String getInstruction() {
		return instruction;
	}

	public Product getProductFor() {
		return productFor;
	}

	public long getQuantityUsed() {
		return quantityUsed;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setIn(Product in) {
		this.in = in;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public void setProductFor(Product productFor) {
		this.productFor = productFor;
	}

	public void setQuantityUsed(long quantityUsed) {
		this.quantityUsed = quantityUsed;
	}

}