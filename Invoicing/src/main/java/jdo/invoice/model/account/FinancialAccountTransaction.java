package jdo.invoice.model.account;

import jdo.model.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.UUID;

@Entity
public class FinancialAccountTransaction extends PersistentEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private FinancialAccount affecting;

	@Temporal(TemporalType.DATE)
	private Date entryDate;

	/**
	 * UUID for Party.
	 * 
	 */
	private UUID executedBy;

	@Temporal(TemporalType.DATE)
	private Date transactionDate;

	public FinancialAccount getAffecting() {
		return affecting;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public UUID getExecutedBy() {
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

	public void setExecutedBy(UUID executedBy) {
		this.executedBy = executedBy;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
}
