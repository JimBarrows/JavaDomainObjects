package jdo.product.model.part;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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

	private String comment;

	private Product in;

	private String instruction;

	private Product productFor;

	private long quantityUsed;
	
	private DateTimeRange	dateTimeRange	= new DateTimeRange();

	@Embedded
	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	@Lob
	public String getComment() {
		return comment;
	}

	@ManyToOne
	@JoinColumn(name="productComponentIn")
	public Product getIn() {
		return in;
	}

	@Lob
	public String getInstruction() {
		return instruction;
	}

	@ManyToOne
	public Product getProductFor() {
		return productFor;
	}

	@Min(0)
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