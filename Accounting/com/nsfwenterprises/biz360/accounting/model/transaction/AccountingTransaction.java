package com.nsfwenterprises.biz360.accounting.model.transaction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.nsfwenterprises.biz360.accounting.model.transaction.detail.TransactionDetail;
import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class AccountingTransaction extends BasePersistentModel {

	public AccountingTransaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<TransactionDetail> composedOf = new ArrayList<TransactionDetail>();

	private AccountingTransactionType describedBy;

	private String description;

	private Date entryDate;

	private Date transactionDate;

	@OneToMany
	public List<TransactionDetail> getComposedOf() {
		return composedOf;
	}

	@ManyToOne
	public AccountingTransactionType getDescribedBy() {
		return describedBy;
	}

	@Lob
	public String getDescription() {
		return description;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getEntryDate() {
		return entryDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
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
