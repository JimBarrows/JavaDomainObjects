package jdo.invoice.model.payment;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import jdo.invoice.model.account.Deposit;

@Entity
public class Receipt extends Payment {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	@ManyToOne
	private Deposit				depositedVia;

	
	public Deposit getDepositedVia() {
		return depositedVia;
	}

	public void setDepositedVia(Deposit depositedVia) {
		this.depositedVia = depositedVia;
	}
}
