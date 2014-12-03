package jdo.accounting.model.transaction;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import jdo.invoice.model.payment.Payment;

@Entity
public class PaymentAccountingTransaction extends ExternalAccountingTransaction {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@OneToOne
	private Payment				originatedFrom;

	public Payment getOriginatedFrom() {
		return originatedFrom;
	}

	public void setOriginatedFrom(Payment originatedFrom) {
		this.originatedFrom = originatedFrom;
	}

}
