package jdo.accounting.model.transaction.detail;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import jdo.accounting.model.OrganizationGlAccount;
import jdo.accounting.model.transaction.AccountingTransaction;
import jdo.fields.Money;
import jdo.model.BasePersistentModel;

@Entity
public class TransactionDetail extends BasePersistentModel {

	public TransactionDetail() {
		super();
	}

	/**
	 * 
	 */
	private static final long		serialVersionUID	= 1L;

	private OrganizationGlAccount	allocatedTo;

	private Money					amount;

	private List<TransactionDetail>	associatedWith		= new ArrayList<TransactionDetail>();

	private boolean					debitCreditFlag;

	private AccountingTransaction	partOf;

	private TransactionDetail		relatedTo;

	@ManyToOne
	public OrganizationGlAccount getAllocatedTo() {
		return allocatedTo;
	}

	@Embedded
	public Money getAmount() {
		return amount;
	}

	@OneToMany(mappedBy = "relatedTo")
	public List<TransactionDetail> getAssociatedWith() {
		return associatedWith;
	}

	@ManyToOne
	public AccountingTransaction getPartOf() {
		return partOf;
	}

	@ManyToOne
	public TransactionDetail getRelatedTo() {
		return relatedTo;
	}

	public boolean isDebitCreditFlag() {
		return debitCreditFlag;
	}

	public void setAllocatedTo(OrganizationGlAccount allocatedTo) {
		this.allocatedTo = allocatedTo;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public void setAssociatedWith(List<TransactionDetail> associatedWith) {
		this.associatedWith = associatedWith;
	}

	public void setDebitCreditFlag(boolean debitCreditFlag) {
		this.debitCreditFlag = debitCreditFlag;
	}

	public void setPartOf(AccountingTransaction partOf) {
		this.partOf = partOf;
	}

	public void setRelatedTo(TransactionDetail relatedTo) {
		this.relatedTo = relatedTo;
	}
}
