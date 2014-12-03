package jdo.invoice.model.account;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import jdo.invoice.model.payment.Receipt;

@Entity
public class Deposit extends FinancialAccountTransaction {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private List<Receipt>		causedBy;

	@OneToMany(mappedBy = "depositedVia")
	public List<Receipt> getCausedBy() {
		return causedBy;
	}

	public void setCausedBy(List<Receipt> causedBy) {
		this.causedBy = causedBy;
	}

}
