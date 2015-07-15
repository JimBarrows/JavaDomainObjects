package jdo.product.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import jdo.fields.DateTimeRange;
import jdo.model.BasePersistentModel;

/**
 * Indicates that a product is well suited to function with other products.
 * 
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:35 AM
 */
@Entity
public class ProductComplement extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private Product				aUseOf;

	@ManyToOne
	private Product				complementFor;

	@NotNull
	private String				reason;

	@Embedded
	private DateTimeRange		dateTimeRange		= new DateTimeRange();

	public DateTimeRange getDateTimeRange() {
		return dateTimeRange;
	}

	public void setDateTimeRange(DateTimeRange dateTimeRange) {
		this.dateTimeRange = dateTimeRange;
	}

	public Product getAUseOf() {
		return aUseOf;
	}

	public Product getComplementFor() {
		return complementFor;
	}

	public String getReason() {
		return reason;
	}

	public void setAUseOf(Product useOf) {
		aUseOf = useOf;
	}

	public void setComplementFor(Product complementFor) {
		this.complementFor = complementFor;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}