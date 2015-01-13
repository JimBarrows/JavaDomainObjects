package jdo.invoice.model.status;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.invoice.model.Invoice;
import jdo.model.BasePersistentModel;

@Entity
public class InvociceStatus extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private Date				statusDate;

	@ManyToOne
	private Invoice				statusFor;

	@ManyToOne
	private InvoiceStatusType	type;

	
	public Date getStatusDate() {
		return statusDate;
	}

	
	public Invoice getStatusFor() {
		return statusFor;
	}
	
	public InvoiceStatusType getType() {
		return type;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public void setStatusFor(Invoice statusFor) {
		this.statusFor = statusFor;
	}

	public void setType(InvoiceStatusType type) {
		this.type = type;
	}
}
