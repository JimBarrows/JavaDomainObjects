package mbmp.product.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import mbmp.model.BasePersistentModel;

/** Shows which products are about to be or have already been superseded by other products.
 * @author Jim
 * @version 1.0
 * @created 25-Dec-2007 9:54:36 AM
 */
@Entity
public class ProductObsolescence extends BasePersistentModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Product aUseOf;
	
	
	private Product obsolescenceFor;
	
	
	private String reason;
	
	private Date supercessionDate;

	@ManyToOne
	public Product getAUseOf() {
		return aUseOf;
	}

	@ManyToOne
	public Product getObsolescenceFor() {
		return obsolescenceFor;
	}

	@Lob
	@NotNull
	public String getReason() {
		return reason;
	}

	@Temporal(TemporalType.DATE)
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