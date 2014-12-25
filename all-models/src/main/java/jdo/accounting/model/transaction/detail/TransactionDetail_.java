package jdo.accounting.model.transaction.detail;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.OrganizationGlAccount;
import jdo.accounting.model.transaction.AccountingTransaction;
import jdo.fields.Money;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-24T17:30:45.403-0700")
@StaticMetamodel(TransactionDetail.class)
public class TransactionDetail_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<TransactionDetail, OrganizationGlAccount> allocatedTo;
	public static volatile SingularAttribute<TransactionDetail, Money> amount;
	public static volatile ListAttribute<TransactionDetail, TransactionDetail> associatedWith;
	public static volatile SingularAttribute<TransactionDetail, AccountingTransaction> partOf;
	public static volatile SingularAttribute<TransactionDetail, TransactionDetail> relatedTo;
	public static volatile SingularAttribute<TransactionDetail, Boolean> debitCreditFlag;
}
