package jdo.product.model;

import jdo.model.PersistentEntity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Date;

/**
 * Shows which products are about to be or have already been superseded by other
 * products.
 * 
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:36 AM
 */
@Entity
public class ProductObsolescence extends PersistentEntity {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private Product				aUseOf;

	@ManyToOne
	private Product				obsolescenceFor;

	@Lob
	@NotEmpty
	private String				reason;

	@Temporal(TemporalType.DATE)
	private Date				supercessionDate;

	
	public Product getAUseOf() {
		return aUseOf;
	}

	
	public Product getObsolescenceFor() {
		return obsolescenceFor;
	}

	
	public String getReason() {
		return reason;
	}

	
	public Date getSupercessionDate() {
		return supercessionDate;
	}

	public void setAUseOf(Product useOf) {
		aUseOf = useOf;
	}

	public void setObsolescenceFor(Product obsolescenceFor) {
		this.obsolescenceFor = obsolescenceFor;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void setSupercessionDate(Date supercessionDate) {
		this.supercessionDate = supercessionDate;
	}

}