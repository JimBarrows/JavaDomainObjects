package mbmp.accounting.model.transaction.detail;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.accounting.model.OrganizationGlAccount;
import mbmp.accounting.model.transaction.AccountingTransaction;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:19.975-0700")
@StaticMetamodel(TransactionDetail.class)
public class TransactionDetail_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<TransactionDetail, OrganizationGlAccount> allocatedTo;
	public static volatile SingularAttribute<TransactionDetail, BigDecimal> amount;
	public static volatile ListAttribute<TransactionDetail, TransactionDetail> associatedWith;
	public static volatile SingularAttribute<TransactionDetail, AccountingTransaction> partOf;
	public static volatile SingularAttribute<TransactionDetail, TransactionDetail> relatedTo;
	public static volatile SingularAttribute<TransactionDetail, Boolean> debitCreditFlag;
}
