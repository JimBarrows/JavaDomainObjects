package mbmp.invoice.model.account;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mbmp.model.BasePersistentModel_;

@Generated(value="Dali", date="2013-01-04T22:11:20.468-0700")
@StaticMetamodel(FinancialAccount.class)
public class FinancialAccount_ extends BasePersistentModel_ {
	public static volatile SingularAttribute<FinancialAccount, String> name;
	public static volatile ListAttribute<FinancialAccount, FinancialAccountRole> ownedBy;
	public static volatile ListAttribute<FinancialAccount, FinancialAccountTransaction> transactions;
	public static volatile SingularAttribute<FinancialAccount, FinancialAccountType> type;
}
