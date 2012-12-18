package mbmp.invoice.model.account;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import mbmp.model.BasePersistentModel;
import mbmp.party.model.Party;

@Entity
public class FinancialAccountTransaction extends BasePersistentModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private FinancialAccount affecting;
	
	private Date entryDate;
	
	private Party executedBy;
	
	private Date transactionDate;

	@ManyToOne
	public FinancialAccount getAffecting() {
		return affecting;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public Party getExecutedBy() {
		return executedBy;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setAffecting(FinancialAccount affecting) {
		this.affecting = affecting;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public void setExecutedBy(Party executedBy) {
		this.executedBy = executedBy;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
}
