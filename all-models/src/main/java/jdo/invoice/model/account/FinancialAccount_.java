package jdo.invoice.model.account;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-12-24T16:23:55.688-0700")
@StaticMetamodel(FinancialAccount.class)
public class FinancialAccount_ {
	public static volatile ListAttribute<FinancialAccount, FinancialAccountRole> ownedBy;
	public static volatile ListAttribute<FinancialAccount, FinancialAccountTransaction> transactions;
	public static volatile SingularAttribute<FinancialAccount, FinancialAccountType> type;
	public static volatile SingularAttribute<FinancialAccount, String> name;
}
