package mbmp.invoice.model.account;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;
import mbmp.party.model.Party;

@Generated(value="Dali", date="2013-01-04T22:11:20.476-0700")
@StaticMetamodel(FinancialAccountTransaction.class)
public class FinancialAccountTransaction_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<FinancialAccountTransaction, FinancialAccount> affecting;
	public static volatile SingularAttribute<FinancialAccountTransaction, Date> entryDate;
	public static volatile SingularAttribute<FinancialAccountTransaction, Party> executedBy;
	public static volatile SingularAttribute<FinancialAccountTransaction, Date> transactionDate;
}
