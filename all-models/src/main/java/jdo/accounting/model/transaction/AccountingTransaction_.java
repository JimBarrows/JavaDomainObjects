package jdo.accounting.model.transaction;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.accounting.model.transaction.detail.TransactionDetail;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-02T21:45:36.674-0700")
@StaticMetamodel(AccountingTransaction.class)
public class AccountingTransaction_ extends BasePersistentModel_ {
	public static volatile ListAttribute<AccountingTransaction, TransactionDetail> composedOf;
	public static volatile SingularAttribute<AccountingTransaction, AccountingTransactionType> describedBy;
	public static volatile SingularAttribute<AccountingTransaction, String> description;
	public static volatile SingularAttribute<AccountingTransaction, Date> entryDate;
	public static volatile SingularAttribute<AccountingTransaction, Date> transactionDate;
}
