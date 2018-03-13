package jdo.accounting.model.transaction;

import jdo.accounting.model.transaction.detail.TransactionDetail;
import jdo.model.PersistentEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class AccountingTransaction extends PersistentEntity {

	public AccountingTransaction() {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToMany
	private List<TransactionDetail> composedOf = new ArrayList<TransactionDetail>();

	@ManyToOne
	private AccountingTransactionType describedBy;

	@Lob
	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	private Date entryDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date transactionDate;

	
	public List<TransactionDetail> getComposedOf() {
		return composedOf;
	}
	
	public AccountingTransactionType getDescribedBy() {
		return describedBy;
	}

	
	public String getDescription() {
		return description;
	}

	
	public Date getEntryDate() {
		return entryDate;
	}

	
	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setComposedOf(List<TransactionDetail> composedOf) {
		this.composedOf = composedOf;
	}

	public void setDescribedBy(AccountingTransactionType describedBy) {
		this.describedBy = describedBy;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
}
