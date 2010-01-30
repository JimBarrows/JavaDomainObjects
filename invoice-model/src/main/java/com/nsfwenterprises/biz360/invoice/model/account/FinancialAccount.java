package com.nsfwenterprises.biz360.invoice.model.account;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.nsfwenterprises.biz360.model.BasePersistentModel;

@Entity
public class FinancialAccount extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private List<FinancialAccountRole> ownedBy;
	
	private List<FinancialAccountTransaction> transactions;
	
	private FinancialAccountType type;

	public String getName() {
		return name;
	}

	@OneToMany
	public List<FinancialAccountRole> getOwnedBy() {
		return ownedBy;
	}

	@OneToMany
	public List<FinancialAccountTransaction> getTransactions() {
		return transactions;
	}

	@ManyToOne
	public FinancialAccountType getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwnedBy(List<FinancialAccountRole> ownedBy) {
		this.ownedBy = ownedBy;
	}

	public void setTransactions(List<FinancialAccountTransaction> transactions) {
		this.transactions = transactions;
	}

	public void setType(FinancialAccountType type) {
		this.type = type;
	}

}
