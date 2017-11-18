package jdo.accounting.model.transaction.detail;

import jdo.accounting.model.OrganizationGlAccount;
import jdo.accounting.model.transaction.AccountingTransaction;
import jdo.fields.Money;
import jdo.model.BasePersistentModel;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TransactionDetail extends BasePersistentModel {

	public TransactionDetail() {
		super();
	}

	/**
	 * 
	 */
	private static final long				serialVersionUID	= 1L;

	@ManyToOne
	private OrganizationGlAccount		allocatedTo;

	@Embedded
	private Money										amount;

	@OneToMany(mappedBy = "relatedTo")
	private List<TransactionDetail>	associatedWith		= new ArrayList<TransactionDetail>();

	private boolean									debitCreditFlag;

	@ManyToOne
	private AccountingTransaction		partOf;

	@ManyToOne
	private TransactionDetail				relatedTo;

	public OrganizationGlAccount getAllocatedTo() {
		return allocatedTo;
	}

	public Money getAmount() {
		return amount;
	}

	public List<TransactionDetail> getAssociatedWith() {
		return associatedWith;
	}

	public AccountingTransaction getPartOf() {
		return partOf;
	}

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
