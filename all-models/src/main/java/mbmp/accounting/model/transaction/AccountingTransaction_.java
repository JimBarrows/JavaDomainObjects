package mbmp.accounting.model.transaction;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.accounting.model.transaction.detail.TransactionDetail;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:19.931-0700")
@StaticMetamodel(AccountingTransaction.class)
public class AccountingTransaction_ extends BasePersistentModel_ {
	public static volatile ListAttribute<AccountingTransaction, TransactionDetail> composedOf;
	public static volatile SingularAttribute<AccountingTransaction, AccountingTransactionType> describedBy;
	public static volatile SingularAttribute<AccountingTransaction, String> description;
	public static volatile SingularAttribute<AccountingTransaction, Date> entryDate;
	public static volatile SingularAttribute<AccountingTransaction, Date> transactionDate;
}
