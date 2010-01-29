package com.nsfwenterprises.biz360.invoice.model.account;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.nsfwenterprises.biz360.invoice.model.payment.Disbursement;

@Entity
public class Withdrawal extends FinancialAccountTransaction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Disbursement causedBy;

	@OneToOne
	public Disbursement getCausedBy() {
		return causedBy;
	}

	public void setCausedBy(Disbursement causedBy) {
		this.causedBy = causedBy;
	}

}
