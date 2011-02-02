package com.nsfwenterprises.biz360.invoice.model.status;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nsfwenterprises.biz360.invoice.model.Invoice;
import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class InvociceStatus extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Date statusDate;
	
	private Invoice statusFor;
	
	private InvoiceStatusType type;

	@Temporal(TemporalType.TIMESTAMP)
	public Date getStatusDate() {
		return statusDate;
	}

	@ManyToOne
	public Invoice getStatusFor() {
		return statusFor;
	}

	@ManyToOne
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
