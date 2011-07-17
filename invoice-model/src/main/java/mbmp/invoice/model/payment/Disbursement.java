package mbmp.invoice.model.payment;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import mbmp.invoice.model.account.Withdrawal;


@Entity
public class Disbursement extends Payment {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Withdrawal affecting;

	@OneToOne
	public Withdrawal getAffecting() {
		return affecting;
	}

	public void setAffecting(Withdrawal affecting) {
		this.affecting = affecting;
	}
		
}
