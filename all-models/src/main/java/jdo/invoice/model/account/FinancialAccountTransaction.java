package jdo.invoice.model.account;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import jdo.model.BasePersistentModel;
import jdo.party.model.Party;

@Entity
public class FinancialAccountTransaction extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private FinancialAccount affecting;

	@Temporal(TemporalType.DATE)
	private Date entryDate;

	@ManyToOne
	private Party executedBy;

	@Temporal(TemporalType.DATE)
	private Date transactionDate;

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
