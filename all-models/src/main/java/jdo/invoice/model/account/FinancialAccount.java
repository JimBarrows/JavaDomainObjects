package jdo.invoice.model.account;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.model.BasePersistentModel;

@Entity
public class FinancialAccount extends BasePersistentModel {

	/**
	 * 
	 */
	private static final long									serialVersionUID	= 1L;

	private String														name;

	@OneToMany
	private List<FinancialAccountRole>				ownedBy;

	@OneToMany
	private List<FinancialAccountTransaction>	transactions;

	@ManyToOne
	private FinancialAccountType							type;

	public String getName() {
		return name;
	}

	public List<FinancialAccountRole> getOwnedBy() {
		return ownedBy;
	}

	public List<FinancialAccountTransaction> getTransactions() {
		return transactions;
	}

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
