package jdo.invoice.model.account;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jdo.model.BasePersistentModel_;

@Generated(value="Dali", date="2014-12-24T17:30:46.608-0700")
@StaticMetamodel(FinancialAccount.class)
public class FinancialAccount_ extends BasePersistentModel_ {
	public static volatile ListAttribute<FinancialAccount, FinancialAccountRole> ownedBy;
	public static volatile ListAttribute<FinancialAccount, FinancialAccountTransaction> transactions;
	public static volatile SingularAttribute<FinancialAccount, FinancialAccountType> type;
	public static volatile SingularAttribute<FinancialAccount, String> name;
}
